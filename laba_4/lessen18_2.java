package project18_2;

public class lessen18_2 {
    public static void main(String[] args) {
        int height = 11;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("+");
            }
            System.out.println();
        }
    }
}