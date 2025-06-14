package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Число: " + i + " | Время: " + java.time.LocalTime.now());
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });
        t.start();
        t.join();
    }
}