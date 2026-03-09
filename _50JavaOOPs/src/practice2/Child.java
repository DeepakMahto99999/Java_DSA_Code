package practice2;
import practice.Parent;  // Import Parent class

// Subclass of Parent
public class Child extends Parent {
    public void display() {
        // Accessing protected members from Parent class
        System.out.println("Protected Field: " + protectedField);
        protectedMethod();
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();  // Allowed because Child extends Parent

        // Parent obj2 = new Parent(); ❌ NOT ALLOWED - Cannot access protected members via object
        // System.out.println(obj2.protectedField); ❌ ERROR
    }
}
