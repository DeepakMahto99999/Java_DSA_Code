package abstact;

public class LearnInterface {

    // 'Animal' is abstract; cannot be instantiated
    // Animal a1 = new Animal();

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.eats();
        monkey.drinks();

//        Animal.LEGS = 5;
        System.out.println(Animal.LEGS);
    }
}

interface Pet{

    void sings();

    void drinks();
}

interface Animal{

    // by default they are public static final
     int LEGS =4;

    // interfaces method are by default abstract because interface made   for abstract class
    // public is also available in interface method because if we make   private then how will subclass access the method property of abstract class

     void eats();

     void drinks();

     default void walk(){
         System.out.println("Animal is wolking");
     }
}

class Monkey implements Animal , Pet {

    @Override
    public void eats(){
        System.out.println("Monkey is eating");
    }


    @Override
    public void sings(){
        System.out.println("Monkey is singing");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is drinking");
    }

}


