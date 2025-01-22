package org.example;

import java.util.Random;

public class example18_5 {
    private int value;

    public void setValue() {
        this.value = 0;
    }


    public void setValue(int value) {
        if (value > 100) {
            this.value = 100;
        } else {
            this.value = value;
        }
    }

    public example18_5() {
        this.value = 0;
    }

    public example18_5(int value) {
        if (value > 100) {
            this.value = 100;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Random random = new Random();


        int randomValue1 = random.nextInt(151);  // Диапазон от 0 до 150
        int randomValue2 = random.nextInt(151);

        System.out.println("Случайное число для первого объекта: " + randomValue1);
        System.out.println("Случайное число для второго объекта: " + randomValue2);

        example18_5 obj1 = new example18_5();
        System.out.println("Значение поля первого объекта (по умолчанию): " + obj1.getValue());

        obj1.setValue(randomValue1);
        System.out.println("Значение поля первого объекта после изменения: " + obj1.getValue());

        example18_5 obj2 = new example18_5(randomValue2);
        System.out.println("Значение поля второго объекта (через конструктор): " + obj2.getValue());

        obj2.setValue();
        System.out.println("Значение поля второго объекта после сброса: " + obj2.getValue());
    }
}