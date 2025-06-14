package org.example;

import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;
import java.io.*;
import java.util.*;
1
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Парсинг itlearn.ru");
        System.out.println("2. Парсинг fat.urfu.ru");
        System.out.print("Выберите действие: ");

        int action = scanner.nextInt();
        scanner.nextLine();

        try {
            switch(action) {
                case 1: parseItLearn(); break;
                case 2: parseFatUrfu(); break;
                default: System.out.println("Неверный выбор");
            }
        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
            try {
                Thread.sleep(2000);
                main(args);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }

    private static void parseItLearn() throws IOException {
        String url = "https://itlearn.ru/first-steps";
        Document doc = Jsoup.connect(url).get();
        Elements links = doc.select("a[href]");

        try (FileWriter writer = new FileWriter("itlearn_links.txt")) {
            for (Element link : links) {
                String linkText = link.attr("abs:href");
                System.out.println(linkText);
                writer.write(linkText + "\n");
            }
            System.out.println("Результаты сохранены в itlearn_links.txt");
        }
    }

    private static void parseFatUrfu() throws IOException {
        String url = "http://fat.urfu.ru/index.html";
        Document doc = Jsoup.connect(url).get();
        Elements news = doc.select("body > table > tbody > tr > td > div > table > tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > tr > td:nth-child(1)");

        try (FileWriter writer = new FileWriter("fat_news.txt")) {
            for (Element element : news) {
                String title = element.select("td[width=70%]").text();
                String date = element.select("td[width=15%]").text();

                if (!title.isEmpty() && !date.isEmpty()) {
                    System.out.println("\nТема: " + title);
                    System.out.println("Дата: " + date);
                    writer.write("Тема: " + title + "\n");
                    writer.write("Дата: " + date + "\n\n");
                }
            }
            System.out.println("Результаты сохранены в fat_news.txt");
        }
    }
}