import java.util.Scanner;

public class example19_18 {

    // Метод для вычисления гипотенузы по теореме Пифагора
    public static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);  // Возвращаем квадратный корень из суммы квадратов катетов
    }

    // Метод для вычисления a в степени b с использованием логарифма и экспоненты
    public static double calculatePower(double a, double b) {
        return Math.exp(b * Math.log(a));  // Используем exp(b * log(a))
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Вводим катеты для расчета гипотенузы
        System.out.print("Введите длину первого катета: ");
        double a = input.nextDouble();
        System.out.print("Введите длину второго катета: ");
        double b = input.nextDouble();

        // Вычисляем гипотенузу
        double hypotenuse = calculateHypotenuse(a, b);
        System.out.println("Гипотенуза: " + hypotenuse);

        // Вводим числа для вычисления a^b
        System.out.print("Введите число a для вычисления a^b: ");
        a = input.nextDouble();
        System.out.print("Введите число b для вычисления a^b: ");
        b = input.nextDouble();

        // Вычисляем a^b
        double powerResult = calculatePower(a, b);
        System.out.println("Результат a^b: " + powerResult);

        input.close();  // Закрываем сканер
    }
}