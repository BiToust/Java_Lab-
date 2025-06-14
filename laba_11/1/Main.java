package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Листинг 1: Фильтрация четных чисел");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа через пробел:");
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] evenNumbers = filterEvenNumbers(numbers);
        System.out.println("Четные числа: " + Arrays.toString(evenNumbers));
    }

    public static int[] filterEvenNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .toArray();
    }
}