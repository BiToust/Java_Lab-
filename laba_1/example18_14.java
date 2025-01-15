import java.util.Scanner;

public class example18_14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int youAge = input.nextInt();

        System.out.print("Введите текущий год: ");
        int nowYear = input.nextInt();

        int youYear = nowYear - youAge;

        System.out.println("Ваш год рождения: " + youYear);

        input.close();
    }
}