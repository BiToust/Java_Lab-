package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            final int threadNumber = i;
            new Thread(() -> System.out.println("Поток " + threadNumber)).start();
        }
    }
}