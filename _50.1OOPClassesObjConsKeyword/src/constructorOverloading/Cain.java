package constructorOverloading;

class Student {
    String name;
    int age;

    // Constructor with one parameter
    Student(String name) {
        this.name = name;
    }

    // Constructor with two parameters
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default constructor calling another constructor
    Student() {
        this("Unknown", 18);
    }

    // Method to display employee details
    void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

public class Cain {   // Renamed class to avoid conflict
    public static void main(String[] args) {
        // Creating objects

        Student s1 = new Student("Deepu");
        Student s2 = new Student("Deepu", 22);

        System.out.println("Student 1: Name = " + s1.name);
        System.out.println("Student 2: Name = " + s2.name + ", Age = " + s2.age);


        Student s3 = new Student();
        s3.display();

    }
}

