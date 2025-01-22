package org.example;

public class example18_1 {

    public static char char_field;
    public static String string_field;

    public static void setCharOrStringField(char argument) {
        char_field = argument;
        System.out.println("Char");
        System.out.println("Символьное поле установлено: " + char_field);
    }

    public static void setCharOrStringField(String argument) {
        string_field = argument;
        System.out.println("String");
        System.out.println("Текстовое поле установлено: " + string_field);
    }

    public static void setCharOrStringField(char[] charArray) {
        if (charArray.length == 1) {
            char_field = charArray[0];
            System.out.println("Array = 1");
            System.out.println("Символьное поле установлено из массива: " + char_field);
        } else {
            String result = "";
            for (char element : charArray) {
                result += element + " ";
            }
            string_field = result.trim();
            System.out.println("Array > 1");
            System.out.println("Текстовое поле установлено из массива: " + string_field);
        }
    }

    public static void main(String[] args) {
        char test_char = 'K';
        String test_string = "hello";
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};
        char[] charArraOne = {'f'};

        setCharOrStringField(test_char);
        setCharOrStringField(test_string);
        setCharOrStringField(charArray);
        setCharOrStringField(charArraOne);
    }
}