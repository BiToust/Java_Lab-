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

            byte[] array = new byte[size];
            byte sum = 0;

            System.out.println("Введите элементы массива (от -128 до 127):");
            for (int i = 0; i < size; i++) {
                int num = scanner.nextInt();
                if (num < Byte.MIN_VALUE || num > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Число " + num + " выходит за границы типа byte");
                }
                array[i] = (byte) num;
                sum += array[i];
            }
            System.out.println("Сумма: " + sum);

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введена строка вместо числа");
        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}