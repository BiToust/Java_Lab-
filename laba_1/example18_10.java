import java.util.Scanner;

public class example19_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the day of the week (e.g., Monday, Tuesday):");
        String day = input.nextLine();
		
        System.out.print("Enter the current month: ");
        String month = input.nextLine();

        System.out.print("Enter today's date (day): ");
        String date = input.nextLine();

        System.out.println(day + ", " + date + "." + month);

        input.close();
    }
}