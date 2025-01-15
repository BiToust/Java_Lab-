import java.util.Scanner;

public class example19_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month: ");
        String month = input.nextLine();

        System.out.print("Enter the number of days in the month: ");
        int days = input.nextInt();

        System.out.println("The month of " + month + " contains " + days + " days.");

        input.close();
    }
}