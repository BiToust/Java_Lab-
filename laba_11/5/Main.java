package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Строки с подстрокой");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строки через запятую:");
        String[] strings = scanner.nextLine().split(",");

        System.out.println("Введите подстроку для поиска:");
        String substring = scanner.nextLine().trim();

        String[] filteredStrings = filterStringsBySubstring(strings, substring);
        System.out.println("Строки, содержащие подстроку: " + Arrays.toString(filteredStrings));
    }

    public static String[] filterStringsBySubstring(String[] strings, String substring) {
        return Arrays.stream(strings)
                .map(String::trim)
                .filter(s -> s.contains(substring))
                .toArray(String[]::new);
    }
}