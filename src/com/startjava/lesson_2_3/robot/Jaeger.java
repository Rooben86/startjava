package com.startjava.lesson_2_3.robot;

public class Jaeger {
    
    private String modelName;
    private String origin;
    private float height;
    private int strength;

    public Jaeger(String modelName, String origin, float height, int strength) {
        this.modelName = modelName;
        this.origin = origin;
        this.height = height;
        this.strength = strength;
    }
    
    public String getModelName() {
        return modelName;
    }   

    void setModelName(String modelName) {
        if(modelName == "") {
            System.out.println("Пустая строка");
        } else {
        this.modelName = modelName;
        }
    }

    public String getOrigin() {
        return origin;
    }

    void setOrigin(String origin) {
        this.origin = origin;
    }

    public float getHeight() {
        return height;
    }

    void setHeight(float height) {
        if(height <= 0) {
            System.out.println("некорректное значение");
            } else {
            this.height = height;
            }
    }

    public int getStrength() {
        return strength;
    }

    void setStrength(int strength) {
        if(strength <=7) {
            System.out.println("некорректное значение");
        } else {
            this.strength = strength;
        }
    }

    public void fight() {
        System.out.println("useBodyLanguage");
    }

    public String makePowerMove() {
        return "PowerMove";
    }

    public void useWeapon() {
        System.out.println("activated");
    }

    public String toString() {
        return "modelName= " + modelName + 
            ", origin= " + origin +
            ", height=" + height +
            " strength=" + strength;
    }
}