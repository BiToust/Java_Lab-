import java.util.Scanner;

public class example18_20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Вводим число a
        System.out.print("Введите число a: ");
        double a = input.nextDouble();

        // Вводим число b (степень)
        System.out.print("Введите число b (степень): ");
        double b = input.nextDouble();

        // Вычисляем a^b с помощью метода Math.pow()
        double result = Math.pow(a, b);

        // Выводим результат
        System.out.println("Результат a^b: " + result);

        input.close();  // Закрываем сканер
    }
}