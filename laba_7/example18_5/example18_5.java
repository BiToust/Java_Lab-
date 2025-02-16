package org.example;

class SuperClass {
    protected String textField;

    public SuperClass(String textField) {
        this.textField = textField;
    }

    public void displayInfo() {
        System.out.println("Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "textField: " + this.textField);
    }
}

class FirstSubClass extends SuperClass {
    protected int intField;

    public FirstSubClass(String textField, int intField) {
        super(textField);
        this.intField = intField;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "textField: " + this.textField + "\n" +
                "intField: " + this.intField);
    }
}

class SecondSubClass extends SuperClass {
    protected char charField;

    public SecondSubClass(String textField, char charField) {
        super(textField);
        this.charField = charField;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "textField: " + this.textField + "\n" +
                "charField: " + this.charField);
    }
}

public class example18_5 {
    public static void main(String[] args) {
        SuperClass superClassObj = new SuperClass("Текст из SuperClass");
        superClassObj.displayInfo();

        FirstSubClass firstSubClassObj = new FirstSubClass("Текст из FirstSubClass", 100);
        firstSubClassObj.displayInfo();

        SecondSubClass secondSubClassObj = new SecondSubClass("Текст из SecondSubClass", 'A');
        secondSubClassObj.displayInfo();

        SuperClass refToFirstSubClass = new FirstSubClass("Текст через ссылку на FirstSubClass", 200);
        refToFirstSubClass.displayInfo();

        SuperClass refToSecondSubClass = new SecondSubClass("Текст через ссылку на SecondSubClass", 'B');
        refToSecondSubClass.displayInfo();
    }
}