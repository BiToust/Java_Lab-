import java.util.Scanner;

public class example19_16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = input.nextInt();

        int numberMinus = number - 1;
        int numberPlus = number + 1;
        int sum = number + numberMinus + numberPlus;
        int square = sum * sum;

        System.out.println(numberMinus + ", " + number + ", " + numberPlus + ", " + square);

        input.close();
    }
}