package project18_6;

import java.util.Random;

public class lessen18_6 {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 6;

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


        int rowToDelete = random.nextInt(rows);
        int colToDelete = random.nextInt(columns);

        System.out.println("\nУдаляемая строка: " + rowToDelete);
        System.out.println("Удаляемый столбец: " + colToDelete);

        
        int[][] newArray = new int[rows - 1][columns - 1];

        for (int i = 0, newI = 0; i < rows; i++) {
            if (i == rowToDelete) continue;

            for (int j = 0, newJ = 0; j < columns; j++) {
                if (j == colToDelete) continue;

                newArray[newI][newJ] = array[i][j];
                newJ++;
            }
            newI++;
        }

        System.out.println("\nНовый массив (после удаления строки и столбца):");
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < columns - 1; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}