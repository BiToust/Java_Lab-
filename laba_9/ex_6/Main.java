package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in, "Windows-1251");

        System.out.println("Введите 10 пар: целое число (ключ) и строку (значение)");

        for (int i = 0; i < 10; i++) {
            System.out.print("Ключ №" + (i + 1) + ": ");
            int key = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Значение №" + (i + 1) + ": ");
            String value = scanner.nextLine();

            map.put(key, value);
        }

        // 1. Строки, у которых ключ > 5
        System.out.println("\nСтроки, у которых ключ больше 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println("Ключ: " + entry.getKey() + ", Значение: " + entry.getValue());
            }
        }

        System.out.println("\nЗначения с ключом 0 (через запятую):");
        if (map.containsKey(0)) {
            System.out.println(map.get(0));
        } else {
            System.out.println("Нет значения с ключом 0.");
        }

        long product = 1;
        boolean found = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                found = true;
            }
        }

        System.out.println("\nПроизведение ключей, у которых длина строки больше 5:");
        if (found) {
            System.out.println(product);
        } else {
            System.out.println("Нет строк длиной больше 5.");
        }
    }
}
