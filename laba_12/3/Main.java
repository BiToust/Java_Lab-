package org.example;

public class Main {
    private static int number = 1;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            synchronized (lock) {
                while (number <= 10) {
                    if (number % 2 == 0) {
                        System.out.println(
                                "[Четный поток] Число: " + number +
                                        " | Время: " + java.time.LocalTime.now()
                        );
                        number++;
                        lock.notifyAll();
                    } else {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                }
            }
        }, "ЧетныйПоток");

        Thread oddThread = new Thread(() -> {
            synchronized (lock) {
                while (number <= 10) {
                    if (number % 2 != 0) {
                        System.out.println(
                                "[Нечетный поток] Число: " + number +
                                        " | Время: " + java.time.LocalTime.now()
                        );
                        number++;
                        lock.notifyAll();
                    } else {
                        try { lock.wait(); } catch (InterruptedException e) {}
                    }
                }
            }
        }, "НечетныйПоток");

        evenThread.start();
        oddThread.start();
    }
}