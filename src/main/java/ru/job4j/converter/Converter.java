package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float exp = 2;
        boolean passed = exp == euro;
        System.out.println("140 rubles are " + euro + " euro. 140 rubles are 2. Test result : " + passed);
        float dollar = Converter.rubleToDollar(140);
        exp = 2.3333333f;
        passed = exp == dollar;
        System.out.println("140 rubles are " + dollar + " dollar. 140 rubles are 2.3333333. Test result : " + passed);
    }
}
