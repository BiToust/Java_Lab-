package project18_8;

import java.util.Scanner;

public class lessen18_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String encText = encrypt(inputText, key);
        System.out.println("Текст после преобразования: " + encText);

        scanner.nextLine();

        System.out.println("Выполнить обратное преобразование? (y/n)");
        String answer = scanner.nextLine().toLowerCase();

        if (answer.equals("y")) {
            String decryptedText = encrypt(encText, 26 - key);
            System.out.println("Текст после обратного преобразования: " + decryptedText);
        } else {
            System.out.println("До свидания!");
        }
    }

    public static String encrypt(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                result.append((char) ((c - base + key) % 26 + base));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}