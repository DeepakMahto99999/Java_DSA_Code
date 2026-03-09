package abstact;

public class LearnInnerClass {

    class Toy{
        int price;

    }

    static class Playstation{
        int price;
    }

    public static void main(String[] args) {
        LearnInnerClass obj = new LearnInnerClass();
        Toy toy = obj.new Toy();
        toy.price = 45;

        Playstation playstation = new LearnInnerClass.Playstation();
    }
}


// Both inner classes (Toy and Playstation) are inside LearnInnerClass,
// which means they are encapsulated within it