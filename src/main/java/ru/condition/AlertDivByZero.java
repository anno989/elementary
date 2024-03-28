package ru.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        boolean result1 = number == 0;
        if (result1) {
            System.out.println("Could not div by 0.");
        }
        boolean result2 = number < 0;
        if (result2) {
            System.out.println("This is negative number.");
        }
    }

    public static void main(String[] args) {
        AlertDivByZero.possibleDiv(4);
        AlertDivByZero.possibleDiv(0);
        AlertDivByZero.possibleDiv(-4);
    }
}