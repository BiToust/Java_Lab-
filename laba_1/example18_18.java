import java.util.Scanner;

public class example18_18 {

    public static double Hypatenuz(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double calculatePower(double a, double b) {
        return Math.exp(b * Math.log(a));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите длину первого катета: ");
        double a = input.nextDouble();
        System.out.print("Введите длину второго катета: ");
        double b = input.nextDouble();

        double hypotenuse = Hypatenuz(a, b);
        System.out.println("Гипотенуза: " + hypotenuse);

        System.out.print("Введите число a для вычисления a^b: ");
        a = input.nextDouble();
        System.out.print("Введите число b для вычисления a^b: ");
        b = input.nextDouble();

        double powerResult = calculatePower(a, b);
        System.out.println("Результат a^b: " + powerResult);

        input.close();
    }
}