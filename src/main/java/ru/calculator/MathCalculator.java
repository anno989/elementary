package ru.calculator;

import static ru.math.MathFunction.*;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.math.MathFunction.sum(first, second)
                + ru.math.MathFunction.multiply(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return ru.math.MathFunction.difference(first, second)
                + ru.math.MathFunction.division(first, second);
    }

    public static double sumAndMultiplyAndDifferenceAndDivision(double first, double second) {
        return  ru.math.MathFunction.sum(first, second)
                + ru.math.MathFunction.multiply(first, second)
                + ru.math.MathFunction.difference(first, second)
                + ru.math.MathFunction.division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + differenceAndDivision(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndDifferenceAndDivision(10, 20));
    }
}


