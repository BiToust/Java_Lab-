package project18_2;

import java.util.Scanner;

public class example18_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 5 == 2 && number % 7 == 1) {
            System.out.println("Число удовлетворяет условиям.");
        } else {
            System.out.println("Число НЕ удовлетворяет условиям.");
        }
    }
}