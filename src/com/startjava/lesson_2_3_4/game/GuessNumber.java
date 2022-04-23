package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    private final Player p1;
    private final Player p2;
    private Player p0;
    private int randomNumber;
    private Scanner scanner;

    public GuessNumber(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public void play() {
        randomNumber = new Random().nextInt(100) + 1;
        p1.clear();
        p2.clear();
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

    private boolean isGuessed(Player p0) {
        String name = p0.getName();
        System.out.print(name + " , твоя очередь угадывать число: ");
        int guess = scanner.nextInt();
        p0.setGuess(guess);
        p0.setAttempt(p0.getAttempt() + 1);
        if (guess == randomNumber) {
            System.out.println("Игрок " + name + " угадал число " + guess + " с " + p0.getAttempt() + " попытки");
            return true;
        }
        if (guess < randomNumber) {
            System.out.println("Это число меньше, чем загадал компьютер");
        } else {
            System.out.println("Это число больше, чем загадал компьютер");
        }
        if (p0.getAttempt() == 10) {
            System.out.println("У " + name + " закончились попытки");
        }
        return false;
    }

    private void printGuesses(Player p0) {
        System.out.println("Попытки " + p0.getName() + ": " + Arrays.toString(p0.getGuesses()));
    }
}