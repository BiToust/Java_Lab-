package org.example;

import java.util.Random;

public class example18_10 {

    public static int[] getMaxMinArray(int... args) {
        int[] result = {args[0], args[0]};

        for (int number : args) {
            if (number > result[0]) {
                result[0] = number;
            } else if (number < result[1]) {
                result[1] = number;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[10];
        System.out.print("Случайные числа: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(200) - 100; // Генерируем числа от -100 до 100
            System.out.print(randomNumbers[i] + " ");
        }
        System.out.println();
        int[] result = getMaxMinArray(randomNumbers);
        System.out.printf("Max: %d, Min: %d\n", result[0], result[1]);
    }
}