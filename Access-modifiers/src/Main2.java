class Animal {

    public void sound() {
        System.out.println("Animal makes a sound");
    }

}

class Dog extends Animal {

    @Override
    public void sound() {
        System.out.println("Dog says: Bark");
    }

    public void fetch() {
        System.out.println("Dog is fetching the ball");
    }

}

class Cat extends Animal {

    @Override
    public void sound() {
        System.out.println("Cat says: Meow");
    }

}

class Lion extends Animal {

    @Override
    public void sound() {
        System.out.println("Lion says: Roar");
    }

}

public class Main2 {

    // Generic Method
    public static void playSound(Animal animal) {

        animal.sound();

    }

    public static void main(String[] args) {

        System.out.println("---------------Example 1----------------");

        Dog dog = new Dog();

        dog.sound();
        dog.fetch();

        // dog only methods are available


        System.out.println("\n---------------Example 2----------------");

        Animal a1 = new Dog();

        a1.sound();
        // a1.fetch();   // ❌ Compile Error


        System.out.println("\n---------------Example 3----------------");

        Animal a2 = new Cat();

        a2.sound();


        System.out.println("\n---------------Example 4----------------");

        Animal a3 = new Lion();

        a3.sound();

        System.out.println("\n---------------Example 5----------------");

        playSound(new Dog());

        playSound(new Cat());

        playSound(new Lion());

    }
}


