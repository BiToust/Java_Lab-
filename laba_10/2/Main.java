package org.example;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import org.w3c.dom.*;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "books.xml";

        try {
            Document doc = loadOrCreateXml(filePath);

            while (true) {
                System.out.println("\n1. Добавить книгу");
                System.out.println("2. Найти книги по автору");
                System.out.println("3. Найти книги по году");
                System.out.println("4. Удалить книгу");
                System.out.println("5. Выход");
                System.out.print("Выберите действие: ");

                int action = scanner.nextInt();
                scanner.nextLine();

                if (action == 5) break;

                switch(action) {
                    case 1: addBook(doc, filePath, scanner); break;
                    case 2: searchByAuthor(doc, scanner); break;
                    case 3: searchByYear(doc, scanner); break;
                    case 4: deleteBook(doc, filePath, scanner); break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Document loadOrCreateXml(String filePath) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document doc;

        File file = new File(filePath);
        if (!file.exists()) {
            doc = builder.newDocument();
            Element root = doc.createElement("library");
            doc.appendChild(root);
            saveXmlFile(doc, filePath);
        } else {
            doc = builder.parse(file);
        }
        return doc;
    }

    private static void addBook(Document doc, String filePath, Scanner scanner) throws Exception {
        System.out.print("Введите название книги: ");
        String title = scanner.nextLine();
        System.out.print("Введите автора: ");
        String author = scanner.nextLine();
        System.out.print("Введите год издания: ");
        String year = scanner.nextLine();

        Element newBook = doc.createElement("book");
        Element titleElement = doc.createElement("title");
        titleElement.appendChild(doc.createTextNode(title));
        newBook.appendChild(titleElement);

        Element authorElement = doc.createElement("author");
        authorElement.appendChild(doc.createTextNode(author));
        newBook.appendChild(authorElement);

        Element yearElement = doc.createElement("year");
        yearElement.appendChild(doc.createTextNode(year));
        newBook.appendChild(yearElement);

        doc.getDocumentElement().appendChild(newBook);
        saveXmlFile(doc, filePath);
        System.out.println("Книга добавлена");
    }

    private static void searchByAuthor(Document doc, Scanner scanner) {
        System.out.print("Введите автора для поиска: ");
        String searchAuthor = scanner.nextLine();

        NodeList books = doc.getElementsByTagName("book");
        boolean found = false;

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String bookAuthor = book.getElementsByTagName("author").item(0).getTextContent();

            if (bookAuthor.equalsIgnoreCase(searchAuthor)) {
                printBookInfo(book);
                found = true;
            }
        }

        if (!found) System.out.println("Книги не найдены");
    }

    private static void searchByYear(Document doc, Scanner scanner) {
        System.out.print("Введите год для поиска: ");
        String searchYear = scanner.nextLine();

        NodeList books = doc.getElementsByTagName("book");
        boolean found = false;

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String bookYear = book.getElementsByTagName("year").item(0).getTextContent();

            if (bookYear.equals(searchYear)) {
                printBookInfo(book);
                found = true;
            }
        }

        if (!found) System.out.println("Книги не найдены");
    }

    private static void deleteBook(Document doc, String filePath, Scanner scanner) throws Exception {
        System.out.print("Введите название книги для удаления: ");
        String deleteTitle = scanner.nextLine();

        NodeList books = doc.getElementsByTagName("book");
        boolean found = false;

        for (int i = 0; i < books.getLength(); i++) {
            Element book = (Element) books.item(i);
            String bookTitle = book.getElementsByTagName("title").item(0).getTextContent();

            if (bookTitle.equalsIgnoreCase(deleteTitle)) {
                book.getParentNode().removeChild(book);
                saveXmlFile(doc, filePath);
                System.out.println("Книга удалена");
                found = true;
                break;
            }
        }

        if (!found) System.out.println("Книга не найдена");
    }

    private static void saveXmlFile(Document doc, String filePath) throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filePath));
        transformer.transform(source, result);
    }

    private static void printBookInfo(Element book) {
        String title = book.getElementsByTagName("title").item(0).getTextContent();
        String author = book.getElementsByTagName("author").item(0).getTextContent();
        String year = book.getElementsByTagName("year").item(0).getTextContent();

        System.out.println("\nНазвание: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год: " + year);
    }
}