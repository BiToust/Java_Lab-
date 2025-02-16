package org.example;

class SuperClass {
    private String textField;

    public SuperClass(String textField) {
        this.textField = textField;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "textField: " + this.textField;
    }
}

class SubClass extends SuperClass {
    private String additionalTextField;

    public SubClass(String textField) {
        super(textField);
    }

    public SubClass(String textField, String additionalTextField) {
        super(textField);
        this.additionalTextField = additionalTextField;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "textField: " + super.toString().split("\n")[1] + "\n" +
                "additionalTextField: " + this.additionalTextField;
    }
}

public class example18_1 {
    public static void main(String[] args) {
        SuperClass superClassObj = new SuperClass("Hello from SuperClass");
        System.out.println(superClassObj);

        SubClass subClassObj1 = new SubClass("Hello from SubClass");
        System.out.println(subClassObj1);

        SubClass subClassObj2 = new SubClass("Hello from SubClass", "Additional text");
        System.out.println(subClassObj2);
    }
}