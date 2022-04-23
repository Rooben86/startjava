package com.startjava.lesson_2_3_4.calculator;

import java.sql.SQLOutput;

public class Calculator {
    
    private int num1;
    private int num2;
    private char operation;

    void setNum1(int num1) {
        this.num1 = num1;
    }

    void setNum2(int num2) {
        this.num2 = num2;
    }

    void setOperation(char operation) {
        this.operation = operation;
    }

    public String calc() {
        int result = 0;
        switch (operation) {
            case '+' -> result = Math.addExact(num1, num2);
            case '-' -> result = Math.subtractExact(num1, num2);
            case '*' -> result = Math.multiplyExact(num1, num2);
            case '/' -> result = Math.floorDiv(num1, num2);
            case '%' -> result = Math.floorMod(num1, num2);
            case '^' -> result = (int) Math.pow(num1, num2);
            default -> {return "некорректная команда";}
        }
        return Integer.toString(result);
    }
}