package ru.condition;

public class LogicNot {
        public static boolean isEven(int num) {
            return num % 2 == 0;
        }

        public static boolean isPositive(int num) {
            return num > 0;
        }
        public static boolean notEven(int num) {
            return !(num % 2 == 0);
        }
        public static boolean notPositive(int num) {
            return !(num < 0);
        }
        public static boolean notEvenAndPositive(int num) {
            return !(num % 2 == 0) && num > 0;
        }
        public static boolean evenOrNotPositive(int num) {
            return (num % 2 == 0) || !(num < 0);
        }

        public static void main(String[] args) {
        int number = 5;

        System.out.println("Is " + number + " even? " + LogicNot.isEven(number));
        System.out.println("Is " + number + " positive? " + LogicNot.isPositive(number));
        System.out.println("Is " + number + " not even? " + LogicNot.notEven(number));
        System.out.println("Is " + number + " not positive? " + LogicNot.notPositive(number));
        System.out.println("Is " + number + " not even and positive? " + LogicNot.notEvenAndPositive(number));
        System.out.println("Is " + number + " even or not positive? " + LogicNot.evenOrNotPositive(number));
    }
}




