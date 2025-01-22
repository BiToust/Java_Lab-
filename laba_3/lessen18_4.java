package project18_4;

import java.util.Scanner;

public class lessen18_4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод двух чисел
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        // Определение наименьшего и наибольшего числа
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        // Вывод чисел с использованием цикла for
        System.out.println("Числа между " + min + " и " + max + ":");
        for (int i = min; i <= max; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}