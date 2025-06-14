package org.example;

import org.json.simple.*;
import org.json.simple.parser.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "books.json";

        try {
            JSONObject jsonObject = loadOrCreateJson(filePath);

            while (true) {
                System.out.println("\n1. Добавить книгу");
                System.out.println("2. Найти книги по автору");
                System.out.println("3. Удалить книгу по названию");
                System.out.println("4. Выход");
                System.out.print("Выберите действие: ");

                int action = scanner.nextInt();
                scanner.nextLine();

                if (action == 4) break;

                JSONArray books = (JSONArray) jsonObject.get("books");

                switch(action) {
                    case 1: addBook(jsonObject, filePath, scanner); break;
                    case 2: searchByAuthor(books, scanner); break;
                    case 3: deleteBook(jsonObject, filePath, books, scanner); break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONObject loadOrCreateJson(String filePath) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject;

        File file = new File(filePath);
        if (!file.exists()) {
            jsonObject = new JSONObject();
            jsonObject.put("books", new JSONArray());
            saveJsonFile(jsonObject, filePath);
        } else {
            jsonObject = (JSONObject) parser.parse(new FileReader(filePath));
        }
        return jsonObject;
    }

    private static void addBook(JSONObject jsonObject, String filePath, Scanner scanner) throws Exception {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите автора: ");
        String author = scanner.nextLine();
        System.out.print("Введите год издания: ");
        String year = scanner.nextLine();

        JSONObject newBook = new JSONObject();
        newBook.put("title", title);
        newBook.put("author", author);
        newBook.put("year", year);

        JSONArray books = (JSONArray) jsonObject.get("books");
        books.add(newBook);
        saveJsonFile(jsonObject, filePath);
        System.out.println("Книга добавлена");
    }

    private static void searchByAuthor(JSONArray books, Scanner scanner) {
        System.out.print("Введите автора для поиска: ");
        String searchAuthor = scanner.nextLine();
        boolean found = false;

        for (Object obj : books) {
            JSONObject book = (JSONObject) obj;
            String author = (String) book.get("author");

            if (author.equalsIgnoreCase(searchAuthor)) {
                printBookInfo(book);
                found = true;
            }
        }

        if (!found) System.out.println("Книги не найдены");
    }

    private static void deleteBook(JSONObject jsonObject, String filePath, JSONArray books, Scanner scanner) throws Exception {
        System.out.print("Введите название книги для удаления: ");
        String deleteTitle = scanner.nextLine();
        Iterator iterator = books.iterator();
        boolean found = false;

        while (iterator.hasNext()) {
            JSONObject book = (JSONObject) iterator.next();
            String title = (String) book.get("title");

            if (title.equalsIgnoreCase(deleteTitle)) {
                iterator.remove();
                saveJsonFile(jsonObject, filePath);
                System.out.println("Книга удалена");
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Книга не найдена");
    }

    private static void saveJsonFile(JSONObject jsonObject, String filePath) throws Exception {
        FileWriter file = new FileWriter(filePath);
        file.write(jsonObject.toJSONString());
        file.flush();
        file.close();
    }

    private static void printBookInfo(JSONObject book) {
        String title = (String) book.get("title");
        String author = (String) book.get("author");
        String year = (String) book.get("year");

        System.out.println("\nНазвание: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год: " + year);
    }
}