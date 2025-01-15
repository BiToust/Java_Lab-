import java.util.Scanner;

public class example18_19 {

    public static double hyp(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите длину первого катета: ");
        double a = input.nextDouble();

        System.out.print("Введите длину второго катета: ");
        double b = input.nextDouble();

        double hypotenuse = hyp(a, b);

        System.out.println("Гипотенуза: " + hypotenuse);

        input.close();
    }
}