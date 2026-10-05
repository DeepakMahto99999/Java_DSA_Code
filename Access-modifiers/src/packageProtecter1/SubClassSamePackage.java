package packageProtecter1;

public class SubClassSamePackage  extends Child{

    public static void main(String[] args) {

        SubClassSamePackage s = new SubClassSamePackage();

        System.out.println(s.name);

        s.display();
    }
}

// output
// Deepak
// Protected Method

// conclusion
// Accessible in a subclass within the same package.