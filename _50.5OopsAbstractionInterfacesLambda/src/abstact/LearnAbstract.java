package abstact;

public class LearnAbstract {

    public static void main(String[] args) {
//        Vehicle v1 = new Vehicle();
        Car c1 = new Car();
        c1.accelarate();
        c1.brakes(4);
        c1.honks();
    }
}


class Human{

    void speak(){

    }
    // this can't be create abstract method should be in abstact class
    //    abstract void eat();
}

abstract  class Vehicle{

   abstract void accelarate();

   abstract int brakes(int wheels);

   void honks(){
     System.out.println("Vehicle honks");
    }


}

class Scooter extends Vehicle{

    @Override
    void accelarate() {

    }

    @Override
    int brakes(int wheels) {
        return 0;
    }
}

class Car extends Vehicle {

    @Override  // this is called annotation no usages of this without we can access, this is use for only spelling check
    void accelarate(){
        System.out.println("Car is Accelerating");
    }

    @Override
    int brakes(int wheels){
        System.out.println("Car breaks are pushed");
        return wheels;
    }

    void honks(){
        System.out.println("Car honks");
    }
}

// In your code:
// The abstract class Vehicle defines what should be done (methods accelerate() and brakes(int wheels)) but does not specify how.
//The subclasses (Car, Scooter) implement these methods with their own logic.

//How This Hides Details?
//When you call c1.accelarate();, you don’t need to know how the car accelerates internally.
//Similarly, c1.brakes(4); works, but you don’t care about the internal braking system.


// Simple Example of Abstraction in Real Life
//Imagine a TV remote:

//You press a button to change the channel (you know what to do).
//But you don’t know how the remote internally processes signals (hides implementation details).

//This is abstraction—you interact with the functionality, not the inner workings.
//Similarly, your code:

//  accelerate() is like pressing the remote button—you don’t need to know the internal mechanics.
//  brakes(int wheels) is like a mute button—you just use it, without knowing the electrical circuits inside.