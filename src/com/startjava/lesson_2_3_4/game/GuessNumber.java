package com.startjava.lesson_2_3_4.game;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player p1;
    private final Player p2;
    private int randomNumber;
    private Scanner scanner;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void play() {
        init();
        System.out.println("Компьютер загадал число " + "(" + randomNumber + ")" + " У каждого игрока 10 попыток");
        scanner = new Scanner(System.in);

        while (true) {
            if (isGuessed(p1)) {
                break;
            }
            if (isGuessed(p2)) {
                break;
            }
            if (p1.getAttempt() == 10 || p2.getAttempt() == 10) {
                break;
            }
        }
        printGuesses(p1);
        printGuesses(p2);
    }

    private void init() {
        randomNumber = new Random().nextInt(100) + 1;
        p1.clear();
        p2.clear();
    }

    private boolean isGuessed(Player pl) {
        String name = pl.getName();
        System.out.print(name + ", твоя очередь угадывать число: ");
        int guess = scanner.nextInt();
        pl.setGuess(guess);
        pl.setAttempt(pl.getAttempt() + 1);
        if (guess == randomNumber) {
            System.out.print("\nПоздравляем! Игрок " + name + " угадал число " + guess + " с " + pl.getAttempt() + " попытки");
            return true;
        }
        String str = guess < randomNumber ? "меньше" : "больше";
        System.out.println("Это число " + str + ", чем загадал компьютер");
        if (pl.getAttempt() == 10) {
            System.out.println("У " + name + " закончились попытки");
        }
        return false;
    }

    private void printGuesses(Player pl) {
        System.out.print("\nПопытки " + pl.getName() + " ");
        for(int guess : pl.getGuesses()) {
            System.out.print(guess + " ");
        }
    }
}