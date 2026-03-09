package stringss;


 class student{
    private int age;
}

public class dout {
    public static void main(String[] args) {
        student s = new student();
        // s.age = 20;  ❌ ERROR: Cannot access private field
        // System.out.println(s.age); ❌ ERROR: Cannot access private field
    }
}
