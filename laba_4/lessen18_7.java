package project18_7;

public class lessen18_7 {
    public static void main(String[] args) {
        int rows = 6;
        int columns = 6;
        int[][] array = new int[rows][columns];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < columns; j++) {
                    array[i][j] = value++;
                }
            } else {
                for (int j = columns - 1; j >= 0; j--) {
                    array[i][j] = value++;
                }
            }
        }

        System.out.println("Массив, заполненный 'змейкой':");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}