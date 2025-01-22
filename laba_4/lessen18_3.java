package project18_3;

public class lessen18_3 {
    public static void main(String[] args) {
        int height = 5;
        int width = 10;

        int[][] treyg = new int[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
            	treyg[i][j] = 2;
            }
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(treyg[i][j] + " ");
            }
            System.out.println();
        }
    }
}