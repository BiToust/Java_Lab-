package project18_1;

import java.util.Scanner;

public class lessen18_1 {
    public static void main(String[] args) {
        Scanner id = new Scanner(System.in);

        System.out.println("Введите число от 1 до 7 для определения дня недели:");
        int day = id.nextInt();

        
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Некорректное значение. Введите число от 1 до 7.");
                break;
        }

        id.close();
    }
}