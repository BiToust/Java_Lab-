package task_2012;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int f = input.nextInt();
        int S = 12;

        if ((S-f)*45 <= 4 * 60){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
