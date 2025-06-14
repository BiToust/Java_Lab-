package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите номер столбца:");
            int col = scanner.nextInt();
            if (col < 0 || col >= matrix[0].length) {
                throw new ArrayIndexOutOfBoundsException("Столбец " + col + " не существует");
            }

            System.out.println("Столбец " + col + ":");
            for (int[] row : matrix) {
                System.out.println(row[col]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введена строка вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}