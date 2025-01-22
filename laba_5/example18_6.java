package org.example;

import java.util.Scanner;

public class example18_6 {

    private int max, min;

    public void setMaxAndMin(int number) {
        if (this.max < number) {
            this.max = number;
        } else if (this.min > number) {
            this.min = number;
        }
    }

    public void setMaxAndMin(int number1, int number2) {
        int maxNumber = Math.max(number1, number2);
        int minNumber = Math.min(number1, number2);

        if (this.max < maxNumber) {
            this.max = maxNumber;
        }
        if (this.min > minNumber || this.min == 0) {
            this.min = minNumber;
        }
    }

    // Метод для отображения значений полей
    public void showMaxMin() {
        System.out.printf("\nmax: %d\nmin: %d", this.max, this.min);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Создаем объект
        example18_6 obj = new example18_6();

        // Вводим значения с клавиатуры
        System.out.print("Введите первое число: ");
        int number1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = in.nextInt();

        // Тест с 1 аргументом
        System.out.println("\nПри первом аргументе:");
        obj.setMaxAndMin(number1);
        obj.showMaxMin();

        // Тест с 2 аргументами
        System.out.println("\nПри двух аргументах:");
        obj.setMaxAndMin(number1, number2);
        obj.showMaxMin();
    }
}