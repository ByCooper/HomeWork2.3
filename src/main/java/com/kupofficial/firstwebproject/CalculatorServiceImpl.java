package com.kupofficial.firstwebproject;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    public String answerHello(String a) {
        return "Добро пожаловать в калькулятор " + a;
    }

    public String sumOperation(int a, int b) {
        return a + " + " + b + " = " + (a + b);
    }

    public String minusOperation(int a, int b) {
        return a + " - " + b + " = " + (a - b);
    }

    public String multiplyOperation(int a, int b) {
        return a + " * " + b + " = " + (a * b);
    }

    public String divideOperation(double a, double b) {
        if (b == 0) {
            return "<b>WARNING</b>" + " На ноль делить <b>НЕЛЬЗЯ</b>";
        } else {
            return a + " / " + b + " = " + new DecimalFormat("###,###.##").format(a / b);
        }
    }
}
