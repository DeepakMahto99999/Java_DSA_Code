package packageDefault1;

public class Car {

    String name = "Maruti";   // default

    void display() {          // default
        System.out.println("Default Method");
    }

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println(c.name);
        c.display();
    }
}