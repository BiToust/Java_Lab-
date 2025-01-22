package org.example;

public class example18_7 {

    public static int[] charToIntArray(char[] charArray) {
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = (int) charArray[i];
        }

        return intArray;
    }

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'f', 'k'};

        int[] result = charToIntArray(charArray);

        for (int number : result) {
            System.out.println(number);
        }
    }
}
