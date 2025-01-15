import java.util.Scanner;

public class example18_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число a: ");
        double a = input.nextDouble();

        System.out.print("Введите число b (степень): ");
        double b = input.nextDouble();

        double result = Math.pow(a, b);

        System.out.println("Результат a^b: " + result);

        input.close();
    }
}