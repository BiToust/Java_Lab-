package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Листинг 2: Общие элементы двух массивов");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первый массив чисел через пробел:");
        int[] array1 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        System.out.println("Введите второй массив чисел через пробел:");
        int[] array2 = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] commonElements = findCommonElements(array1, array2);
        System.out.println("Общие элементы: " + Arrays.toString(commonElements));
    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        return Arrays.stream(array1)
                .filter(x -> Arrays.stream(array2).anyMatch(y -> y == x))
                .distinct()
                .toArray();
    }
}