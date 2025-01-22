package org.example;

import java.math.BigDecimal;
import java.util.Scanner;

public class example18_4 {
    public char field1;
    public int number1;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();
        System.out.print("Введите символ: ");
        char symbol = in.next().charAt(0);
        System.out.print("Введите число типа double: ");
        double numberDouble = in.nextDouble();


        example18_4 example = new example18_4();
        example.setFields(symbol, number);
        example.setFields(numberDouble);
    }

    public void setFields(char field1, int number1) {
        this.field1 = field1;
        this.number1 = number1;
        System.out.printf("Создан объект с полем: %c и числом: %d\n", this.field1, this.number1);
    }


    public void setFields(double numberDouble) {
        int intPart = (int) numberDouble;
        this.field1 = (char) intPart;

        double fractionalPart = numberDouble - intPart;
        this.number1 = (int) (fractionalPart * 100);

        System.out.printf("Значение double преобразовано: символ = %c, целое число = %d\n", this.field1, this.number1);
    }
}