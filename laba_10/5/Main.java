package org.example;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Создать Excel файл");
        System.out.println("2. Прочитать Excel файл");
        System.out.print("Выберите действие: ");

        int action = scanner.nextInt();
        scanner.nextLine();

        try {
            switch(action) {
                case 1: createExcelFile(); break;
                case 2: readExcelFile(scanner); break;
                default: System.out.println("Неверный выбор");
            }
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.print("Повторить? (да/нет): ");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("да")) main(args);
        }
    }

    private static void createExcelFile() throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Товары");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Название");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Цена");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Книга");
        dataRow1.createCell(1).setCellValue("Программирование на Java");
        dataRow1.createCell(2).setCellValue(1500);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Компьютер");
        dataRow2.createCell(1).setCellValue("Intel Core i7, 16GB RAM");
        dataRow2.createCell(2).setCellValue(50000);

        try (FileOutputStream outputStream = new FileOutputStream("products.xlsx")) {
            workbook.write(outputStream);
        }
        System.out.println("Файл products.xlsx создан");
    }

    private static void readExcelFile(Scanner scanner) throws IOException {
        System.out.print("Введите путь к файлу: ");
        String filePath = scanner.nextLine();

        FileInputStream inputStream = new FileInputStream(new File(filePath));
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        System.out.print("Введите название листа: ");
        String sheetName = scanner.nextLine();

        XSSFSheet sheet = workbook.getSheet(sheetName);
        if (sheet == null) throw new IllegalArgumentException("Лист не найден");

        for (Row row : sheet) {
            for (Cell cell : row) {
                switch (cell.getCellType()) {
                    case STRING: System.out.print(cell.getStringCellValue() + "\t"); break;
                    case NUMERIC: System.out.print(cell.getNumericCellValue() + "\t"); break;
                    default: System.out.print("\t");
                }
            }
            System.out.println();
        }

        workbook.close();
        inputStream.close();
    }
}