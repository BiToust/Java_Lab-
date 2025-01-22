package project18_9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class lessen18_9 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int Size = id.nextInt();
        System.out.println("Размер массива равен " + Size);
        
        int[] nums = new int[Size];
        Random random = new Random();
        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(200);
            System.out.println("Элемент массива [" + i + "] = " + nums[i]);
        }

        int minValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
            }
        }

        System.out.println("Минимальное значение в массиве: " + minValue);

        System.out.print("Индексы элементов с минимальным значением: ");
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == minValue) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}