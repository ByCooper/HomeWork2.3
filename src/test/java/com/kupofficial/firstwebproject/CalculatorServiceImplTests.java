package com.kupofficial.firstwebproject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorServiceImplTests {
    CalculatorServiceImpl cut = new CalculatorServiceImpl();

    private int num1;
    private int num2;
    private int num3;
    private int num4;
    private double num5;
    private double num6;
    private double num7;
    private double num8;


    @BeforeEach
    public void setUp() {
        num1 = 7;
        num2 = 8;
        num3 = 11;
        num4 = 5;
        num5 = 9;
        num6 = 3;
        num7 = 12;
        num8 = 0;
    }

    @Test
    public void getHello() {
        String name = "Grut";
        String actual = cut.answerHello(name);
        String expected = "Добро пожаловать в калькулятор " + name;
        assertEquals(actual, expected);
    }

    @Test
    public void sumOperation() {
        String actual1 = cut.sumOperation(num1, num2);
        String expected1 = num1 + " + " + num2 + " = " + (num1 + num2);
        assertEquals(actual1, expected1);

        String actual2 = cut.sumOperation(num3, num4);
        String expected2 = num3 + " + " + num4 + " = " + (num3 + num4);
        assertEquals(actual2, expected2);
    }

    @Test
    public void minusOperation() {
        String actual1 = cut.minusOperation(num1, num2);
        String expected1 = num1 + " - " + num2 + " = " + (num1 - num2);
        assertEquals(actual1, expected1);

        String actual2 = cut.minusOperation(num3, num4);
        String expected2 = num3 + " - " + num4 + " = " + (num3 - num4);
        assertEquals(actual2, expected2);
    }

    @Test
    public void multiplyOperation() {
        String actual1 = cut.multiplyOperation(num1, num2);
        String expected1 = num1 + " * " + num2 + " = " + (num1 * num2);
        assertEquals(actual1, expected1);

        String actual2 = cut.multiplyOperation(num3, num4);
        String expected2 = num3 + " * " + num4 + " = " + (num3 * num4);
        assertEquals(actual2, expected2);
    }

    @Test
    public void divideOperation() {
        String actual1 = cut.divideOperation(num5, num6);
        String expected1 = num5 + " / " + num6 + " = " + new DecimalFormat("###,###.##").format(num5 / num6);
        assertEquals(actual1, expected1);

        String actual2 = cut.divideOperation(num7, num6);
        String expected2 = num7 + " / " + num6 + " = " + new DecimalFormat("###,###.##").format(num7 / num6);
        assertEquals(actual2, expected2);

    }

    @Test
    public void testIllegalArgumentException() throws IllegalArgumentException{
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            cut.divideOperation(num7, num8);
        });
    }
}
