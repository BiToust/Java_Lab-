package org.example;

public class example18_4 {

    // Без рекурсии
    public static int doubleFactorialIterative(int number) {
        int result = 1;
        while (number > 0) {
            result *= number;
            number -= 2;
        }
        return result;
    }

    // С рекурсией
    public static int doubleFactorialRecursive(int number) {
        if (number <= 0) {
            return 1;
        }
        return number * doubleFactorialRecursive(number - 2);
    }

    public static void main(String[] args) {
        int number = 6;

        int resultIterative = doubleFactorialIterative(number);
        System.out.println("Без рекурсии: " + resultIterative);

        int resultRecursive = doubleFactorialRecursive(number);
        System.out.println("С рекурсией: " + resultRecursive);
    }
}