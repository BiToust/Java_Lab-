import java.util.Scanner;

public class example18_19 {

    // Новый метод для расчета гипотенузы с параметрами
    public static double hyp(double a, double b) {
        return Math.sqrt(a * a + b * b);  // Вычисляем гипотенузу по теореме Пифагора
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Вводим длину первого катета
        System.out.print("Введите длину первого катета: ");
        double a = input.nextDouble();

        // Вводим длину второго катета
        System.out.print("Введите длину второго катета: ");
        double b = input.nextDouble();

        // Вызываем метод hyp() для вычисления гипотенузы
        double hypotenuse = hyp(a, b);

        // Выводим результат
        System.out.println("Гипотенуза: " + hypotenuse);

        input.close();  // Закрываем сканер
    }
}