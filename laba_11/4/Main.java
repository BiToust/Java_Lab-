package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Листинг 4: Квадраты чисел (исправленная версия)
        System.out.println("Квадраты чисел");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через запятую:");
        String input = scanner.nextLine();

        // Удаляем все пробелы и разделяем по запятым
        int[] numbers = Arrays.stream(input.split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] squares = calculateSquares(numbers);
        System.out.println("Квадраты чисел: " + Arrays.toString(squares));
    }

    public static int[] calculateSquares(int[] numbers) {
        return Arrays.stream(numbers)
                .map(n -> n * n)
                .toArray();
    }
}