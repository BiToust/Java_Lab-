package org.example;

public class example18_6 {

    public static int[] createNewArray(int[] intArray, int newLength) {
        int length;

        if (intArray.length < newLength) {
            length = intArray.length;
        } else {
            length = newLength;
        }

        int[] newArray = new int[length];

        for (int i = 0; i < length; i++) {
            newArray[i] = intArray[i];
        }

        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30};

        int number = 5;

        int[] result = createNewArray(array, number);

        System.out.println("Новый массив:");
        for (int value : result) {
            System.out.println(value);
        }
    }
}