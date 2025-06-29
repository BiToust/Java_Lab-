package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки через пробел:");
        String[] strings = scanner.nextLine().split(" ");

        String[] result = new String[strings.length];
        int count = 0;
        for (String s : strings) {
            if (s.matches("[а-яА-Яa-zA-Z]+")) {
                result[count++] = s;
            }
        }

        System.out.println("Результат: " + Arrays.toString(Arrays.copyOf(result, count)));
    }
}