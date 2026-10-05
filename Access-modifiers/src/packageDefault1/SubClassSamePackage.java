package packageDefault1;

public class SubClassSamePackage extends Car{

    public static void main(String[] args) {
        SubClassSamePackage c = new SubClassSamePackage();

        System.out.println(c.name);

        c.display();
    }
}
