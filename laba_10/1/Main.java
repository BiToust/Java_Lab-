package org.example;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Element;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Примеры из раздела 1:");
        System.out.println("1. Работа с XML");
        System.out.println("2. Работа с JSON");
        System.out.println("3. Работа с HTML (Jsoup)");
        System.out.println("4. Работа с Excel (Apache POI)");
        System.out.print("Выберите пример: ");

        int choice = scanner.nextInt();

        switch(choice) {
            case 1: xmlExample(); break;
            case 2: jsonExample(); break;
            case 3: htmlExample(); break;
            case 4: excelExample(); break;
            default: System.out.println("Неверный выбор");
        }
    }

    private static void xmlExample() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            org.w3c.dom.Document doc = builder.newDocument();

            Element root = doc.createElement("library");
            doc.appendChild(root);

            Element book = doc.createElement("book");
            Element title = doc.createElement("title");
            title.appendChild(doc.createTextNode("Пример XML"));
            book.appendChild(title);
            root.appendChild(book);

            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(new DOMSource(doc), new StreamResult(new File("example.xml")));

            System.out.println("XML файл создан: example.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void jsonExample() {
        try {
            JSONObject obj = new JSONObject();
            obj.put("name", "Пример JSON");
            obj.put("version", 1.0);

            JSONArray list = new JSONArray();
            list.add("Элемент 1");
            list.add("Элемент 2");
            obj.put("items", list);

            try (FileWriter file = new FileWriter("example.json")) {
                file.write(obj.toJSONString());
            }

            System.out.println("JSON файл создан: example.json");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void htmlExample() {
        try {
            Document doc = Jsoup.connect("https://example.com").get();
            String title = doc.title();
            System.out.println("Заголовок страницы: " + title);
        } catch (Exception e) {
            System.out.println("Ошибка при парсинге HTML: " + e.getMessage());
        }
    }

    private static void excelExample() {
        try {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Пример");

            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Тест");

            try (FileOutputStream out = new FileOutputStream("example.xlsx")) {
                workbook.write(out);
            }

            System.out.println("Excel файл создан: example.xlsx");
            workbook.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}