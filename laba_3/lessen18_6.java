package project18_6;

import java.util.Scanner;

public class lessen18_6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 0;

        for (;;) {
            System.out.print("Введите размер массива: ");
            try {
                size = Integer.parseInt(scanner.nextLine());
                if (size <= 0) {
                    System.out.println("Размер массива должен быть положительным числом.");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введено некорректное значение. Попробуйте снова.");
            }
        }

        int[] array = new int[size];

        int num = 2;

        for (int i = 0; i < size; i++) {
            array[i] = num;
            num += 5;
        }

        System.out.print("Массив чисел: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}