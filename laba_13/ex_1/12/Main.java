package org.example;

public class Main {
    public static void m(String str, double chislo) {
        if (str == null) {
            throw new IllegalArgumentException("Строка введена неверно");
        }
        if (chislo > 0.001) {
            throw new IllegalArgumentException("Неверное число");
        }
        System.out.println("Параметры верны!");
    }

    public static void main(String[] args) {
        try {
            m(null, 0.000001);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}