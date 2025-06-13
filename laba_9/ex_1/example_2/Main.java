package org.example;

public class Main {

    public static void main(String[] args) {
        example(1);
    }

    public static void example(int x) {
        if (x < 20) {
            example(2 * x + 1);
            System.out.print(x + " ");
        }
    }
}