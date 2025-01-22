package project18_10;

import java.util.Arrays;
import java.util.Collections;

public class lessen18_10 {
    public static void main(String[] args) {

        int size = 10;
        
        Integer[] numbers = new Integer[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 101);
        }

        System.out.println("Массив до сортировки: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());

        System.out.println("Массив после сортировки (по убыванию): " + Arrays.toString(numbers));
    }
}