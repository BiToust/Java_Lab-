package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random random = new Random();
        int arraySize = 10 + random.nextInt(10); // Массив от 10 до 19 элементов
        int[] numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Числа от 0 до 99
        }

        System.out.println("Сгенерированный массив: " + Arrays.toString(numbers));

        long startTime = System.currentTimeMillis();
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("\nИспользуется ядер процессора: " + cores);

        ExecutorService executor = Executors.newFixedThreadPool(cores);
        Future<Integer>[] futures = new Future[cores];
        int chunkSize = numbers.length / cores;

        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = (i == cores - 1) ? numbers.length : start + chunkSize;
            futures[i] = executor.submit(() -> {
                int sum = 0;
                for (int j = start; j < end; j++) {
                    sum += numbers[j];
                }
                System.out.printf("Поток %d: сумма элементов [%d..%d] = %d\n",
                        Thread.currentThread().getId(), start, end-1, sum);
                return sum;
            });
        }

        int totalSum = 0;
        for (Future<Integer> future : futures) {
            totalSum += future.get();
        }

        executor.shutdown();
        long duration = System.currentTimeMillis() - startTime;

        System.out.println("\nОбщая сумма: " + totalSum);
        System.out.println("Время выполнения: " + duration + " мс");
    }
}