package ru.converter;

public class ConverterCurrency {
    public static float rubleToEuro(float value) {
        if (value <= 0) {
            return 0;
        }
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        if (value <= 0) {
            return 0;
        }
        return value / 90;
    }

    public static void main(String[] args) {
        float in = 140;
        float expectedEUR = 1.4F;
        float outEUR = ConverterCurrency.rubleToEuro(in);
        boolean passedEUR = expectedEUR == outEUR;
        System.out.println("140 rubles are 1.4. Test result : " + passedEUR);
        float expectedUSD = 1.5555556F;
        float outUSD = ConverterCurrency.rubleToDollar(in);
        boolean passedUSD = expectedUSD == outUSD;
        System.out.println("140 rubles are 1.5555556. Test result : " + passedUSD);
    }
}


