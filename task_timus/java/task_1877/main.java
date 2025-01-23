package task_1877;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int code_1 = input.nextInt();
        int code_2 = input.nextInt();
        int brute_force = 0;
        String result = "no";

        while (brute_force<=9999) {
            if (brute_force % 2 == 0) {
                if(brute_force == code_1){
                    result = "yes";
                }
            } else {
                if(brute_force == code_2){
                    result = "yes";
                }}
            brute_force++;
        }
        System.out.println(result);
    }
}
