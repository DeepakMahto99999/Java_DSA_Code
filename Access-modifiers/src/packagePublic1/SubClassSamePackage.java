package packagePublic1;

public class SubClassSamePackage extends Student {

    public static void main(String[] args) {
        SubClassSamePackage s = new SubClassSamePackage();

        System.out.println(s.name);

        s.display();

    }
}

// Output
// Deepak
// Public Method

//Conclusion
// ✅ public members are accessible in a subclass within the same package.