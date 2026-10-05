package packagePublic2;

import packagePublic1.Student;

public class OtherClassDifferentPackage {
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println(s.name);

        s.display();
    }
}


// Output
// Deepak
// Public Method

//Conclusion
//✅ public members are accessible from another class in a different package.