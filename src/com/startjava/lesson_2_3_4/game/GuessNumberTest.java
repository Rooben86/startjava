package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String option = "yes";

        System.out.println("Введите имя первого игрока:");
        Player p1 = new Player(scanner.nextLine());
        System.out.println("Имя первого игрока: " + p1.getName());

        System.out.println("Введите имя второго игрока:");
        Player p2 = new Player(scanner.nextLine());
        System.out.println("Имя второго игрока: " + p2.getName());

        GuessNumber guessNumber = new GuessNumber(p1, p2);

        while(option.equalsIgnoreCase("yes")) {
            guessNumber.play();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                option = scanner.next();
                if (option.equalsIgnoreCase("no")) {
                    break;
                } 
            } while(!option.equalsIgnoreCase("yes"));
        }
    }
}