package ru.converter;
public class ConverterTest {

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
        float euro = ConverterTest.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = ConverterTest.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
    }
}
