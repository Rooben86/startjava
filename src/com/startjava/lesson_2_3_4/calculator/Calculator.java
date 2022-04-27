package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    
    private int num1;
    private int num2;
    private char operation;
    private String input;

    void setInput(String input) {
        this.input = input;
    }
    public int calc() {
        String[] str = input.split(" ");
        num1 = Integer.parseInt(str[0]);
        operation = str[1].charAt(0);
        num2 = Integer.parseInt(str[2]);
        switch (operation) {
            case '+' : return Math.addExact(num1, num2);
            case '-' : return Math.subtractExact(num1, num2);
            case '*' : return Math.multiplyExact(num1, num2);
            case '/' : return Math.floorDiv(num1, num2);
            case '%' : return Math.floorMod(num1, num2);
            case '^' : return (int) Math.pow(num1, num2);
            default:
                System.out.println("Некорректная команда");
                return 0;
        }
    }
}