package org.example;

import java.util.Scanner;

public class example18_3 {
    private int number1;
    private int number2;

    //без аргументов
    public example18_3() {
        System.out.println("Создан объект без аргументов - 0");
        this.number1 = 0;
        this.number2 = 0;
    }

    //с одним аргументом
    public example18_3(int number1) {
        System.out.println("Создан объект с одним аргументом - ▲");
        this.number1 = number1;
        this.number2 = 0;
    }

    //с двумя аргументами
    public example18_3(int number1, int number2) {
        System.out.println("Создан объект с двумя аргументами - ■");
        this.number1 = number1;
        this.number2 = number2;
    }

    public void printValues() {
        System.out.printf("number1: %d, number2: %d\n", number1, number2);
    }

    private static int getIntegerInput(String message, Scanner scanner) {
        System.out.println(message);
        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {
            return 0;
        }

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Введено неверное значение, используется значение по умолчанию (0).");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value1 = getIntegerInput(
                "Для 1-го аргумента введите целое число, если нет, то введите 0 (значение по умолчанию):",
                scanner);

        int value2 = getIntegerInput(
                "Для 2-го аргумента введите целое число, если нет, то введите 0 (значение по умолчанию):",
                scanner);

        example18_3 obj;

        if (value1 == 0 && value2 == 0) {
            obj = new example18_3();
        } else if (value1 == 0) {
            obj = new example18_3(value2);
        } else if (value2 == 0) {
            obj = new example18_3(value1);
        } else {
            obj = new example18_3(value1, value2);
        }

        obj.printValues();
        scanner.close();
    }
}