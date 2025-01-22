package project18_7;

import java.util.Scanner;

public class lessen18_7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Размер массива должен быть положительным числом!");
            return;
        }


        char[] A = new char[size];


        for (int i = 0; i < size; i++) {
            A[i] = (char) ('a' + 2 * i);
        }

        System.out.print("Массив в прямом порядке: ");
        for (int i = 0; i < size; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();

        System.out.print("Массив в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }
    }
}