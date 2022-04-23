package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    
    public static void main(String[] args) {
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "USA", 260f, 8);
        Jaeger strikerEureka = new Jaeger("Striker Eureka", "Australia", 230f, 10);

        // gipsyDanger.setModelName("Gipsy Danger");
        // gipsyDanger.setOrigin("USA");
        // gipsyDanger.setHeight(260f);
        // gipsyDanger.setStrength(8);

        // strikerEureka.setModelName("Striker Eureka");
        // strikerEureka.setOrigin("Australia");
        // strikerEureka.setHeight(230f);
        // strikerEureka.setStrength(10);

        System.out.println("Model names: " + gipsyDanger.getModelName() + ", " + strikerEureka.getModelName());
        System.out.println("Origins: " + gipsyDanger.getOrigin() + ", " + strikerEureka.getOrigin());
        System.out.println("Heights: " + gipsyDanger.getHeight() + ", " + strikerEureka.getHeight());
        System.out.println("Strengths: "+ gipsyDanger.getStrength() + ", " + strikerEureka.getStrength());

        gipsyDanger.fight();
        gipsyDanger.makePowerMove();
        gipsyDanger.useWeapon();

        strikerEureka.fight();
        System.out.println(strikerEureka.makePowerMove());
        strikerEureka.useWeapon();

        System.out.println(gipsyDanger);
        System.out.println(strikerEureka);
    }
}