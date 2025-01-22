package org.example;

public class example18_1 {
    private char symbol; // закрытое поле

    // Первый метод (присвоение)
    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    // Второй метод (возвращает)
    public int getCharCode() {
        return (int) symbol;
    }

    // Третий метод (вывод)
    public void printSymbolAndCode() {
        System.out.println("Символ: " + symbol);
        System.out.println("Код символа: " + getCharCode());
    }

    public static void main(String[] args) {
        example18_1 charInfo = new example18_1();
        charInfo.setSymbol('A');
        System.out.println("Код символа через метод: " + charInfo.getCharCode());

        charInfo.printSymbolAndCode();
    }
}