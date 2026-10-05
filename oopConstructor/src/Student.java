class Student {

    String name;
    int age;
    String city;

    Student() {
        this("Unknown", 0);
        System.out.println("No-argument constructor");
    }

//    Student(String name) {
//        this(name, 0);
//    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.city = "Ahmedabad";
        System.out.println("Parameterized constructor");
    }

    void display() {
        System.out.println("Name: " + name + " | Age: " + age + " | City: " + city);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
     //   Student s2 = new Student("Deepak");
     //   Student s3 = new Student("Rahul", 22);

//        System.out.println("--- Student Details ---");
//        s1.display();
//        s2.display();
//        s3.display();
    }
}

