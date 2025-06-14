package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа через пробел:");
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = Arrays.stream(input).mapToInt(Integer::parseInt).toArray();

        long startTime = System.currentTimeMillis();
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Используется ядер процессора: " + cores);

        ExecutorService executor = Executors.newFixedThreadPool(cores);
        Future<Integer>[] futures = new Future[cores];
        int chunkSize = numbers.length / cores;

        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = (i == cores - 1) ? numbers.length : start + chunkSize;
            futures[i] = executor.submit(() -> {
                int max = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (numbers[j] > max) max = numbers[j];
                }
                return max;
            });
        }

        int globalMax = Integer.MIN_VALUE;
        for (Future<Integer> future : futures) {
            globalMax = Math.max(globalMax, future.get());
        }

        executor.shutdown();
        long duration = System.currentTimeMillis() - startTime;

        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        System.out.println("Максимальный элемент: " + globalMax);
        System.out.println("Время выполнения: " + duration + " мс");
    }
}