package org.example;

public class example18_3 {

    public static void printMaxMinAvg(int... args) {
        if (args.length == 0) {
            System.out.println("Нет чисел для вычислений.");
            return;
        }

        int max_number = args[0];
        int min_number = args[0];
        int avg_number = 0;

        for (int number : args) {

            if (number > max_number) {
                max_number = number;
            }

            if (number < min_number) {
                min_number = number;
            }

            avg_number += number;
        }

        avg_number = avg_number / args.length;
        System.out.printf("Max: %d, Min: %d, AVG: %d\n", max_number, min_number, avg_number);
    }

    public static void main(String[] args) {
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 6;
        int six = 30;
        int seven = 62;

        printMaxMinAvg(two);
        printMaxMinAvg(two, three);
        printMaxMinAvg(two, three, four);
        printMaxMinAvg(two, three, four, five);
        printMaxMinAvg(three, four, five, six);
        printMaxMinAvg(four, five, six, seven);
    }
}