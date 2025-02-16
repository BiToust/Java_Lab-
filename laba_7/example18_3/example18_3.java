package org.example;

class FirstClass {
    public int intField;

    public FirstClass(int intField) {
        this.intField = intField;
    }

    public void setField(int intField) {
        this.intField = intField;
    }

    @Override
    public String toString() {
        return "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "intField: " + this.intField;
    }
}

class SecondClass extends FirstClass {
    public char charField;

    public SecondClass(int intField, char charField) {
        super(intField);
        this.charField = charField;
    }

    public void setField(int intField, char charField) {
        super.setField(intField);
        this.charField = charField;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "charField: " + this.charField;
    }
}

class ThirdClass extends SecondClass {
    public String textField;

    public ThirdClass(int intField, char charField, String textField) {
        super(intField, charField);
        this.textField = textField;
    }

    public void setField(int intField, char charField, String textField) {
        super.setField(intField, charField);
        this.textField = textField;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "textField: " + this.textField;
    }
}

public class example18_3 {
    public static void main(String[] args) {
        FirstClass firstClassObj = new FirstClass(10);
        System.out.println(firstClassObj);

        SecondClass secondClassObj = new SecondClass(20, 'A');
        System.out.println(secondClassObj);

        ThirdClass thirdClassObj = new ThirdClass(30, 'B', "Текст из ThirdClass");
        System.out.println(thirdClassObj);

        firstClassObj.setField(100);
        System.out.println(firstClassObj);

        secondClassObj.setField(200, 'Z');
        System.out.println(secondClassObj);

        thirdClassObj.setField(300, 'X', "Новый текст");
        System.out.println(thirdClassObj);
    }
}