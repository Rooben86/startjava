package com.startjava.lesson_2_3.calculator;

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

    public void calc() {
        switch(operation) {
            case '+':
                System.out.print(num1 + num2);
                break;
            case '-':
                System.out.print(num1 - num2);
                break;
            case '*':
                System.out.print(num1 * num2);
                break;
            case '/':
                System.out.print(num1 / num2);
                break;
            case '%':
                System.out.print(num1 % num2);
                break;
            case '^':
                pow();
                break;
            default:
                System.out.println("некорректная команда");
        }
    }

    private void pow() {
        int result = 1;
        for(int i = 0; i < num2; i++) {
        result = num1 * result;
        }
        System.out.println(result);
    }
}