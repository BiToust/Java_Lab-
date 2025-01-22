package project18_4;

public class lessen18_4 {
    public static void main(String[] args) {
        int height = 5;
        int width = 5;


        int[][] triangle = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = 2;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (triangle[i][j] == 2) {
                    System.out.print(triangle[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}