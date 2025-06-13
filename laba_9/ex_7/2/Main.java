package org.example;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Введите количество человек: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        LinkedList<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        System.out.println("Остался человек под номером: " + people.get(0));
    }
}