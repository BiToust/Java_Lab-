import java.util.Scanner;

public class example18_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = input.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int difference = num1 - num2;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);

        input.close();
    }
}