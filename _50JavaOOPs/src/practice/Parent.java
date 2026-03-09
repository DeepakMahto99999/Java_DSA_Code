package practice;

// Parent class
public  class Parent {
    protected int protectedField = 10;

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    public static void main(String[] args) {
        Parent ob = new Parent();
        ob.protectedMethod();
    }
}
