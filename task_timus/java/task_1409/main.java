package task_1409;


public class main {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);

        int harry_hits = input.nextInt();
        int larrry_hits = input.nextInt();

        int number_cans = harry_hits + larrry_hits - 1;

        System.out.printf(
                "%d %d\n",
                number_cans - harry_hits, number_cans - larrry_hits);
    }
}