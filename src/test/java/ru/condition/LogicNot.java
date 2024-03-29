package ru.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return notEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) || notPositive(num);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Is " + number + " even? " + isEven(number));
        System.out.println("Is " + number + " positive? " + isPositive(number));
        System.out.println("Is " + number + " not even? " + notEven(number));
        System.out.println("Is " + number + " not positive? " + notPositive(number));
        System.out.println("Is " + number + " not even and positive? " + notEvenAndPositive(number));
        System.out.println("Is " + number + " even or not positive? " + evenOrNotPositive(number));
    }
}