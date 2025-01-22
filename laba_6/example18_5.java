package org.example;

public class example18_5 {

    public static int sumOfSquaresIterative(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i * i;
        }
        return result;
    }

    // Метод с рекурсией
    public static int sumOfSquaresRecursive(int n) {
        if (n == 0) {
            return 0;
        }
        return n * n + sumOfSquaresRecursive(n - 1);
    }

    public static void main(String[] args) {
        int number = 5;

        int resultIterative = sumOfSquaresIterative(number);
        System.out.println("Сумма квадратов без рекурсии: " + resultIterative);

        int resultRecursive = sumOfSquaresRecursive(number);
        System.out.println("Сумма квадратов с рекурсией: " + resultRecursive);

        int formulaResult = number * (number + 1) * (2 * number + 1) / 6;
        System.out.println("Результат по формуле: " + formulaResult);
    }
}