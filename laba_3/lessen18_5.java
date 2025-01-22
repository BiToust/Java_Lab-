package project18_5;

import java.util.Scanner;

public class lessen18_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел для подсчета суммы: ");
        int A = scanner.nextInt();

        int sum = 0;
        int numbersB = 0;
        System.out.print("Числа, которые удовлетворяют условию: ");
        
        for (int i = 1; numbersB < A; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
                numbersB++;
            }
        }

        System.out.println("\nСумма чисел: " + sum);

        scanner.close();
    }
}