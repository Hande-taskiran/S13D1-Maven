package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (isBarking && (clock>20 || clock<8)) {
            return true;
        } else if (clock<0) {
            return false;
        } else {
            return false;
        }
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if (firstAge<=19 && firstAge>=13 || secondAge<=19 && secondAge>=13 || thirdAge<=19 && thirdAge>=13) {
           return true;
       } else {
            return false;
        }
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if ((isSummer && (temp<=45 && temp>=25)) || (temp<=35 && temp>=25)) {
            return true;
        } else {
            return false;
        }
    }

    public static double area(double width, double height) {

    }

    public static double area(double radius) {

    }
}
