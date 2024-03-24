package ru.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 100;
    }

    public static float rubleToDollar(float value) {
        return value / 90;
    }

    /*public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
    }*/

    public static void main(String[] args) {
        float in = 140;
        float expectedEUR = 1.4F;
        float outEUR = Converter.rubleToEuro(in);
        boolean passedEUR = expectedEUR == outEUR;
        System.out.println("140 rubles are 1.4. Test result : " + passedEUR);
        float expectedUSD = 1.5555556F;
        float outUSD = Converter.rubleToDollar(in);
        boolean passedUSD = expectedUSD == outUSD;
        System.out.println("140 rubles are 1.5555556. Test result : " + passedUSD);
    }
}


