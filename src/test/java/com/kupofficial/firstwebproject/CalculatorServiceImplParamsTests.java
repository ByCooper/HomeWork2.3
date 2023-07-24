package com.kupofficial.firstwebproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DecimalFormat;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceImplParamsTests {
    CalculatorServiceImpl cut = new CalculatorServiceImpl();

    public static final int num1 = 7;
    public static final int num2 = 8;
    public static final int num3 = 11;
    public static final int num4 = 5;


    public static Stream<Arguments> getParamTests() {
        return Stream.of(
                Arguments.of(num1, num2),
                Arguments.of(num3, num4)
        );
    }

    @ParameterizedTest
    @MethodSource("getParamTests")
    public void plusOperation(int q, int w) {
        String actual = cut.sumOperation(q, w);
        String expected = q + " + " + w + " = " + (q + w);
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("getParamTests")
    public void minusOperation(int q, int w) {
        String actual = cut.minusOperation(q, w);
        String expected = q + " - " + w + " = " + (q - w);
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("getParamTests")
    public void multiplyOperation(int q, int w) {
        String actual = cut.multiplyOperation(q, w);
        String expected = q + " * " + w + " = " + (q * w);
        assertEquals(actual, expected);
    }
    @ParameterizedTest
    @MethodSource("getParamTests")
    public void divideOperation(double q, double w) {
        String actual = cut.divideOperation(q, w);
        String expected = q + " / " + w + " = " + new DecimalFormat("###,###.##").format(q / w);
        assertEquals(actual, expected);
    }

}
