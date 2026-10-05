package PackagePrivate1;

public class student {

    private String name = "Deepak";

    private void display() {
        System.out.println("Private Method");
    }

    public static void main(String[] args) {

        student s = new student();
        System.out.println(s.name);

        s.display();
    }
}
