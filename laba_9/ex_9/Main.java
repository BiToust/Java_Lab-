package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int elementsCount = 90_000;
        int indexAccessCount = 90_000;

        System.out.println("Тестирование производительности коллекций");
        System.out.println("Количество элементов: " + elementsCount);
        System.out.println("Тестируемые коллекции: ArrayDeque, ArrayList, TreeSet");

        testAddOperations(elementsCount);
        testRemoveOperations(elementsCount);
        testAccessOperations(indexAccessCount);
    }

    private static void testAddOperations(int count) {
        System.out.println("\nТаблица 1. Время добавления (нс)");
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %-12s %-12s %-12s%n", "Коллекция", "В начало", "В середину", "В конец");
        System.out.println("-----------------------------------------");

        System.out.printf("%-15s %-12d %-12s %-12d%n", "ArrayDeque",
                testAddFirst(new ArrayDeque<>(), count),
                "-",
                testAddLast(new ArrayDeque<>(), count));

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.printf("%-15s %-12d %-12d %-12d%n", "ArrayList",
                testAddFirst(arrayList, count),
                testAddMiddle(arrayList, count),
                testAddLast(arrayList, count));

        System.out.printf("%-15s %-12d %-12s %-12d%n", "TreeSet",
                testAddFirst(new TreeSet<>(), count),
                "-",
                testAddLast(new TreeSet<>(), count));
    }

    private static void testRemoveOperations(int count) {
        System.out.println("\nТаблица 2. Время удаления (нс)");
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %-12s %-12s %-12s%n", "Коллекция", "Из начала", "Из середины", "Из конца");
        System.out.println("-----------------------------------------");

        System.out.printf("%-15s %-12d %-12s %-12d%n", "ArrayDeque",
                testRemoveFirst(new ArrayDeque<>(), count),
                "-",
                testRemoveLast(new ArrayDeque<>(), count));

        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.printf("%-15s %-12d %-12d %-12d%n", "ArrayList",
                testRemoveFirst(arrayList, count),
                testRemoveMiddle(arrayList, count),
                testRemoveLast(arrayList, count));

        System.out.printf("%-15s %-12s %-12s %-12s%n", "TreeSet", "-", "-", "-");
    }

    private static void testAccessOperations(int count) {
        System.out.println("\nТаблица 3. Время доступа по индексу (нс)");
        System.out.println("-----------------------------------------");
        System.out.printf("%-15s %-12s%n", "Коллекция", "По индексу");
        System.out.println("-----------------------------------------");

        System.out.printf("%-15s %-12s%n", "ArrayDeque", "-");
        System.out.printf("%-15s %-12d%n", "ArrayList", testAccessByIndex(new ArrayList<>(), count));
        System.out.printf("%-15s %-12s%n", "TreeSet", "-");
    }

    private static long testAddFirst(Collection<Integer> collection, int count) {
        if (collection instanceof ArrayList) {
            ArrayList<Integer> list = (ArrayList<Integer>) collection;
            long start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                list.add(0, i);
            }
            return System.nanoTime() - start;
        } else if (collection instanceof ArrayDeque) {
            ArrayDeque<Integer> deque = (ArrayDeque<Integer>) collection;
            long start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                deque.addFirst(i);
            }
            return System.nanoTime() - start;
        } else {
            long start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                collection.add(i);
            }
            return System.nanoTime() - start;
        }
    }

    private static long testAddMiddle(ArrayList<Integer> list, int count) {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.add(list.size() / 2, i);
        }
        return System.nanoTime() - start;
    }

    private static long testAddLast(Collection<Integer> collection, int count) {
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            collection.add(i);
        }
        return System.nanoTime() - start;
    }

    private static long testRemoveFirst(Collection<Integer> collection, int count) {
        fillCollection(collection, count + 1000);

        if (collection instanceof ArrayList) {
            ArrayList<Integer> list = (ArrayList<Integer>) collection;
            long start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                list.remove(0);
            }
            return System.nanoTime() - start;
        } else if (collection instanceof ArrayDeque) {
            ArrayDeque<Integer> deque = (ArrayDeque<Integer>) collection;
            long start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                deque.removeFirst();
            }
            return System.nanoTime() - start;
        }
        return -1;
    }

    private static long testRemoveMiddle(ArrayList<Integer> list, int count) {
        fillCollection(list, count + 1000);
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.remove(list.size() / 2);
        }
        return System.nanoTime() - start;
    }

    private static long testRemoveLast(Collection<Integer> collection, int count) {
        fillCollection(collection, count + 1000);

        if (collection instanceof ArrayList) {
            ArrayList<Integer> list = (ArrayList<Integer>) collection;
            long start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                list.remove(list.size() - 1);
            }
            return System.nanoTime() - start;
        } else if (collection instanceof ArrayDeque) {
            ArrayDeque<Integer> deque = (ArrayDeque<Integer>) collection;
            long start = System.nanoTime();
            for (int i = 0; i < count; i++) {
                deque.removeLast();
            }
            return System.nanoTime() - start;
        }
        return -1;
    }

    private static long testAccessByIndex(ArrayList<Integer> list, int count) {
        fillCollection(list, 100_000);
        long start = System.nanoTime();
        for (int i = 0; i < count; i++) {
            list.get(i % list.size());
        }
        return System.nanoTime() - start;
    }

    private static void fillCollection(Collection<Integer> collection, int count) {
        collection.clear();
        for (int i = 0; i < count; i++) {
            collection.add(i);
        }
    }
}