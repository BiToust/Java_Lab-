package project18_5;

import java.util.Random;

public class lessen18_5 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 5;

        int[][] array = new int[rows][columns];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


        int[][] transform = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
            	transform[j][i] = array[i][j];
            }
        }

        System.out.println("\nТранспонированный массив:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transform[i][j] + " ");
            }
            System.out.println();
        }
    }
}