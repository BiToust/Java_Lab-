package org.example;

public class example18_8 {

    public static double getAverage(int[] intArray) {
        double sum = 0;
        for (int number : intArray) {
            sum += number;
        }
        return sum / intArray.length;
    }

    public static void main(String[] args) {
        int[] intArray = {2, 4, 5, 34, 557, 23};

        double average = getAverage(intArray);
        System.out.println("Среднее значение: " + average);
    }
}