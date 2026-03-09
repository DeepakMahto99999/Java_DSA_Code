package practice;

class MyClass1 {
    private int privateField;

    private void privateMethod() {
        System.out.println("This is a private method");
    }

    public void publicMethod() {
        System.out.println("This is a public method");
        privateMethod();
    }

    // Getter method to access privateField
    public int getPrivateField() {
        return privateField;
    }

    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        System.out.println("Private field value: " + obj.getPrivateField()); // Correct way to access privateField
        obj.publicMethod();
    }
}

public class MyClass {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.publicMethod();
        // obj.privateMethod();  // This line will still cause an error, so it's removed
    }
}
