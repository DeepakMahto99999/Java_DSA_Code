package packageProtecter1;

public class TestSamePackage {

    public static void main(String[] args) {

        Child c = new Child();

        System.out.println(c.name);

        c.display();
    }
}

// Output
// Deepak
// Protected Method

//Conclusion
//✅ Accessible from another class in same package