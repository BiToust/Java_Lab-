package org.example;

public class Main {

    public static void main(String[] args) {
        example(1);
    }

    public static void example3(int x) {
        if (x < 20) {
            System.out.print("Before: " + x + " ");
            example3(2 * x + 1);
            System.out.print("After: " + x + " ");
        }
    }
}