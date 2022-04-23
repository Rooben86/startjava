package com.startjava.lesson_2_3_4.person;

public class Person {
    
    char sex = 'm';
    String name = "Ruben";
    float height = 1.70f;
    short weight = 73;
    byte age = 35;

    String walk() {
        return "walking";
    }

    void sit() {
        System.out.println("sitting");
    }

    String run() {
        return "running";
    }

    void speak() {
        System.out.println("speaking");
    }

    boolean learnJava() {
        return true;
    }
}