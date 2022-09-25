package ru.job4j.array;

public class Matrix {

    public static int[][] multiple(int size) {
        int[][] list = new int[size][size];
        for (int row = 0; row < list.length; row++) {
            for (int cell = 0; cell < list[row].length; cell++) {
                list[row][cell] = (row + 1) * (cell + 1);
            }
        }
    return list;
    }
}
