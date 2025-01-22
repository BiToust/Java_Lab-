package org.example;

public class example18_2 {

    private static int number_field = 0;

    public static void printNumberFieldAndIncrement() {
        System.out.println(number_field);
        number_field += 1;
    }

    public static void main(String[] args) {
        int count = 6;

        for (int i = 0; i < count; i++) {
            printNumberFieldAndIncrement();
        }
    }
}