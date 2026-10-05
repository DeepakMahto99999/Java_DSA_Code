package packagePublic2;

import packagePublic1.Student;

public class SubClassDifferentPackage  extends Student {

    public static void main(String[] args) {

       // Student s = new Student();

        SubClassDifferentPackage s = new SubClassDifferentPackage();

        System.out.println(s.name);
        s.display();
    }
}

// Output
// Deepak
// Public Method

//Conclusion
//✅ Accessible in subclass from a different package.