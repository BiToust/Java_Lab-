package org.example;

public class Main {

    public static void main(String[] args) {
        example3(1);
    }

    public static void example3(int x) {
        if (x < 20) {
            System.out.print("До: " + x + " ");
            example3(2 * x + 1);
            System.out.print("После: " + x + " ");
        }
    }
}