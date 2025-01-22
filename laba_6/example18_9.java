package org.example;

public class example18_9 {

    public static char[] swapCharArray(char[] charArray) {
        int leftIndex = 0;
        int rightIndex = charArray.length - 1;

        while (leftIndex < rightIndex) {
            char temp = charArray[leftIndex];
            charArray[leftIndex] = charArray[rightIndex];
            charArray[rightIndex] = temp;

            leftIndex++;
            rightIndex--;
        }

        return charArray;
    }

    public static void main(String[] args) {
        char[] charArray = {'a', 'b', 'c', 'd', 'e'};

        char[] swappedArray = swapCharArray(charArray);

        for (char ch : swappedArray) {
            System.out.print(ch + " ");
        }
    }
}