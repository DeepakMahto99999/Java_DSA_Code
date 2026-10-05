package packagePublic1;

public class Student {

    public String name = "Deepak";

    public void display(){
        System.out.println("Public Method");
    }

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
//✅ public members are accessible inside the same class.