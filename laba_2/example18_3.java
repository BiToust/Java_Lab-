package project18_3;

import java.util.Scanner;

public class example18_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 4 == 0 && number >= 10) {
            System.out.println("Число делится на 4 и не меньше 10.");
        } else {
            System.out.println("Число НЕ делится на 4 или оно меньше 10.");
        }
    }
}