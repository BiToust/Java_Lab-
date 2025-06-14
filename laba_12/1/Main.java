package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 10000) {
                System.out.println("Поток 1: " + java.time.LocalTime.now());
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            long startTime = System.currentTimeMillis();
            while (System.currentTimeMillis() - startTime < 10000) {
                System.out.println("Поток 2: " + java.time.LocalTime.now());
                try { Thread.sleep(1000); } catch (InterruptedException e) {}
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}