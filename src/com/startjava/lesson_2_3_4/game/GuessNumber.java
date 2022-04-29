package com.startjava.lesson_2_3_4.game;

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
        System.out.println("У каждого игрока 10 попыток");

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
        System.out.println("Компьютер загадал число " + "(" + randomNumber + ")");
        p1.clear();
        p2.clear();
    }

    private boolean isGuessed(Player pl) {
        scanner = new Scanner(System.in);
        String name = pl.getName();
        System.out.print(name + ", твоя очередь угадывать число: ");
        int guess = scanner.nextInt();
        pl.setGuess(guess);
        pl.setAttempt(pl.getAttempt() + 1);
        if (guess == randomNumber) {
            System.out.print("\nПоздравляем! " + name + " угадал число с " + pl.getAttempt() + " попытки");
            return true;
        }
        String message = guess < randomNumber ? "меньше" : "больше";
        System.out.println("Это число " + message + ", чем загадал компьютер");
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