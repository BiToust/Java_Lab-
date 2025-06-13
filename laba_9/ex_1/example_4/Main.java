package org.example;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println("Факториал " + n + " = " + result);
    }

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}