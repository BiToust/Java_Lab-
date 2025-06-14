package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Строки с заглавной буквы");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки через запятую:");
        String[] strings = scanner.nextLine().split(",");

        String[] capitalizedStrings = filterCapitalizedStrings(strings);
        System.out.println("Строки с заглавной буквы: " + Arrays.toString(capitalizedStrings));
    }

    public static String[] filterCapitalizedStrings(String[] strings) {
        return Arrays.stream(strings)
                .map(String::trim)
                .filter(s -> !s.isEmpty() && Character.isUpperCase(s.charAt(0)))
                .toArray(String[]::new);
    }
}