package packageProtecter1;


public class Child {

    protected String name = "Deepak";

    protected void display(){
        System.out.println("Protected Method");
    }

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
//✅ Accessible inside the same class.
