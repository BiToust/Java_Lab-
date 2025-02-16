package org.example;

class SuperClass {
    private String textField;

    public SuperClass(String textField) {
        this.textField = textField;
    }

    public void setTextField() {
        this.textField = "Текст по умолчанию";
    }

    public void setTextField(String textField) {
        this.textField = textField;
    }

    public int getTextFieldLength() {
        return textField.length();
    }

    @Override
    public String toString() {
        return "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "textField: " + this.textField + "\n" +
                "Длина textField: " + this.getTextFieldLength();
    }
}

class SubClass extends SuperClass {
    public int intField;

    public SubClass(String textField, int intField) {
        super(textField);
        this.intField = intField;
    }

    public void setFields() {
        super.setTextField();
        this.intField = 0;
    }

    public void setFields(String textField) {
        super.setTextField(textField);
    }

    public void setFields(int intField) {
        this.intField = intField;
    }

    public void setFields(String textField, int intField) {
        super.setTextField(textField);
        this.intField = intField;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "intField: " + this.intField;
    }
}

public class example18_2 {
    public static void main(String[] args) {
        SuperClass superClassObj = new SuperClass("Привет из SuperClass");
        System.out.println(superClassObj);

        SubClass subClassObj = new SubClass("Привет из SubClass", 42);
        System.out.println(subClassObj);

        subClassObj.setFields();
        System.out.println(subClassObj);

        subClassObj.setFields("Новый текст");
        System.out.println(subClassObj);

        subClassObj.setFields(100);
        System.out.println(subClassObj);

        subClassObj.setFields("Финальный текст", 200);
        System.out.println(subClassObj);
    }
}