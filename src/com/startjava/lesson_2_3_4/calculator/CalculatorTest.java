package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String answer = "yes";

        while(answer.equalsIgnoreCase("yes")) {
            System.out.print("Введите математическое выражение:");
            String mathExpression = scanner.nextLine();
            System.out.println(calculator.calc(mathExpression));

            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]:");
                answer = scanner.nextLine();
            } while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("no"));
        }
    }
}