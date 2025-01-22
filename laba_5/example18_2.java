package org.example;

public class example18_2 {
    private char field1, field2;

    public void printBetweenSymbols() {
        int start = Math.min(field1, field2);
        int end = Math.max(field1, field2);

        for (int code = start; code <= end; code++) {
            System.out.printf("Символ: %c, код: %d\n", (char) code, code);
        }
    }

    public void setFields(char field1, char field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public static void main(String[] args) {
        example18_2 symbolsRange = new example18_2();

        symbolsRange.setFields('A', 'D'); //от 'A' до 'D'

        symbolsRange.printBetweenSymbols();
    }
}