package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int n = sc.nextInt();
        System.out.print("Двоичное представление: ");
        toBinary(n);
    }

    public static void toBinary(int n) {
        if (n == 0) return;
        toBinary(n / 2);
        System.out.print(n % 2);
    }
}