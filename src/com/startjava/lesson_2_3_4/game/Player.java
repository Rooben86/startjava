package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class  Player {

    private final String name;
    private int[] guesses;
    private int attempt;

    public Player(String name) {
        this.name = name;
        guesses = new int[10];
        Arrays.fill(guesses, -1);
    }

    public String getName() {
        return name;
    }

    public void setGuess(int guess) {
        guesses[attempt] = guess;
    }

    public int getGuess() {
        return guesses[attempt];
    }

    public int getAttempt() {
        return attempt;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int[] getGuesses() {
        return Arrays.copyOf(guesses, attempt);
    }

    public void clear() {
        Arrays.fill(guesses, 0, attempt, -1);
        attempt = 0;
    }
}