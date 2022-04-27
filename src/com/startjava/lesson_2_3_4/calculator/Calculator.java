package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public int calc(String input) {
        String[] edited = input.split(" ");
        int num1 = Integer.parseInt(edited[0]);
        int num2 = Integer.parseInt(edited[2]);

        switch (edited[1].charAt(0)) {
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