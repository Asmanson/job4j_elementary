package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        return left >= right ? left : right;
    }

    public int max(int left, int right, int second) {
        return max(
                left,
                max(right, second)
        );
    }

    public int max(int left, int right, int second, int fourth) {
        return max(
                left,
                max(
                        right,
                        max(fourth, second)
                )
        );
    }

    public static void main(String[] args) {
        int number = new Max().max(3, 5, 6, 2);
        System.out.println(number);
    }
}
