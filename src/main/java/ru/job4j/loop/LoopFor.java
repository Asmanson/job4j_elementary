package ru.job4j.loop;

public class LoopFor {

    public static void main(String[] args) {
        int i;
        boolean result;
        for (i = 5; i <= 10; i++) {
            System.out.println(i);
        }
        result = i <= 10;
        System.out.println("Индекс после цикла равен: " + i);
        System.out.println("Условие выполнения цикла равно: " + result);
    }
}