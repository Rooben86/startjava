package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";

        while(answer.equalsIgnoreCase("yes")) {
            System.out.print("Введите первое число:");
            calculator.setNum1(scanner.nextInt());
            System.out.print("Введите знак математической операции:");
            calculator.setOperation(scanner.next().charAt(0));
            System.out.print("Введите второе число:");
            calculator.setNum2(scanner.nextInt());
            calculator.calc();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.next();
            } while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
        }
    }
}