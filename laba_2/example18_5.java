package project18_5;

import java.util.Scanner;

public class example18_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (4 значное): ");
        int number = scanner.nextInt();

        int kosar = (number / 1000) % 10;

        System.out.println("Четвертая цифра справа (тысячи): " + kosar);
    }
}