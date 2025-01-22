package project18_3;

import java.util.Scanner;

public class lessen18_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел в последовательности Фибоначчи: ");
        int n = scanner.nextInt();

        System.out.print("Числа Фибоначчи: ");
        printFib(n);

        scanner.close();
    }

    public static void printFib(int n) {
        int a = 1, b = 1;

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(a);
            } else {
                System.out.print(a + " ");
            }
            
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println();
    }
}