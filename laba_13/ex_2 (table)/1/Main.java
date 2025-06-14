package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Введите размер массива:");
            int size = scanner.nextInt();
            if (size <= 0) throw new IllegalArgumentException("Размер массива должен быть положительным");

            int[] array = new int[size];
            int sum = 0;
            int count = 0;

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            }

            if (count == 0) throw new ArithmeticException("Нет положительных элементов");
            System.out.println("Среднее значение: " + (double) sum / count);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введена строка вместо числа");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}