package FinalKeyword;

class Student {
    int age = 18;
}

class Example {
    final Student student = new Student(); // Final reference variable

    void changeValues() {
        student.age = 20; // ✅ Allowed (modifying object content)
//         student = new Student(); // ❌ Compilation error (cannot reassign reference)
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.changeValues();
        obj.student.age = 23;
        System.out.println("Student age: " + obj.student.age);
    }
}

