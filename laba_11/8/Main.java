package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        String[] inputNumbers = scanner.nextLine().split(" ");

        int[] numbers = new int[inputNumbers.length];
        for (int i = 0; i < inputNumbers.length; i++) {
            numbers[i] = Integer.parseInt(inputNumbers[i]);
        }

        System.out.println("Введите минимальное значение:");
        int minValue = scanner.nextInt();

        int[] result = new int[numbers.length];
        int count = 0;
        for (int num : numbers) {
            if (num > minValue) {
                result[count++] = num;
            }
        }

        System.out.println("Результат: " + Arrays.toString(Arrays.copyOf(result, count)));
    }
}