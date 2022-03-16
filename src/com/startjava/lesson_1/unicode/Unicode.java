package com.startjava.lesson_1.unicode;

public class Unicode {
    
    public static void main(String[] args) {
        char ch = '\u0033';
        do {
            System.out.print(ch++);
       } while(ch <= '\u0126');
    }
}