package org.example;

public class Main {
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.println(m());
        } catch (Exception e) {
            System.out.println("Исключение перехвачено в main");
        }
    }
}