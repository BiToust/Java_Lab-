package org.example;

class FirstClass {
    public char charField;

    public FirstClass(char charField) {
        this.charField = charField;
    }

    public FirstClass(FirstClass obj) {
        this.charField = obj.charField;
    }

    @Override
    public String toString() {
        return "Имя класса: " + this.getClass().getSimpleName() + "\n" +
                "charField: " + this.charField;
    }
}

class SecondClass extends FirstClass {
    public String textField;

    public SecondClass(char charField, String textField) {
        super(charField);
        this.textField = textField;
    }

    public SecondClass(SecondClass obj) {
        super(obj);
        this.textField = obj.textField;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "textField: " + this.textField;
    }
}

class ThirdClass extends SecondClass {
    public int intField;

    public ThirdClass(char charField, String textField, int intField) {
        super(charField, textField);
        this.intField = intField;
    }

    public ThirdClass(ThirdClass obj) {
        super(obj);
        this.intField = obj.intField;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "intField: " + this.intField;
    }
}

public class example18_4 {
    public static void main(String[] args) {
        FirstClass firstClassObj = new FirstClass('A');
        System.out.println(firstClassObj);

        SecondClass secondClassObj = new SecondClass('B', "Текст из SecondClass");
        System.out.println(secondClassObj);

        ThirdClass thirdClassObj = new ThirdClass('C', "Текст из ThirdClass", 100);
        System.out.println(thirdClassObj);

        FirstClass firstClassCopy = new FirstClass(firstClassObj);
        System.out.println("Копия FirstClass:\n" + firstClassCopy);

        SecondClass secondClassCopy = new SecondClass(secondClassObj);
        System.out.println("Копия SecondClass:\n" + secondClassCopy);

        ThirdClass thirdClassCopy = new ThirdClass(thirdClassObj);
        System.out.println("Копия ThirdClass:\n" + thirdClassCopy);
    }
}