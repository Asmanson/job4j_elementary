package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        p = (p / (2 * (k + 1)));
        k = p * k;
        double rsl = p * k;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, S = " + result1);
    }
}
