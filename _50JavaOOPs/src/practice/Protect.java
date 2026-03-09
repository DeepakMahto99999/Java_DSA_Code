package practice;

// Subclass in the same package
class Child extends Parent {
    void display() {
        System.out.println("Protected Field: " + protectedField);
        protectedMethod();  // Can access protected members in the same package
    }
}

class ss {
    int defaultField;
    void defaultMethod() {
        System.out.println("This is a default method");
    }
}

// Another class in the same package
public class Protect {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();

        // Accessing Parent class's protected members through an object
        Parent parentObj = new Parent();
        System.out.println("Accessing directly: " + parentObj.protectedField);
        parentObj.protectedMethod(); // Allowed because it's in the same package

        ss obj1 = new ss();
        int x = obj1.defaultField;
        System.out.println(x);
        obj1.defaultMethod();
    }
}
