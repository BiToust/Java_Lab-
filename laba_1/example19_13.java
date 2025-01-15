import java.util.Scanner;

public class example19_13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your birth year: ");
        int youYear = input.nextInt();

        System.out.print("Enter the current year: ");
        int nowtYear = input.nextInt();

        int age = nowtYear - youYear;

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        input.close();
    }
}