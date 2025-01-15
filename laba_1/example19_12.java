import java.util.Scanner;

public class example19_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите ваш год рождения: ");
        int youYear = input.nextInt();

        System.out.print("Введите текущий год: ");
        int nowtYear = input.nextInt();

        int age = nowtYear - youYear;

        System.out.println("Ваш возраст: " + age + " лет.");

        input.close();
    }
}