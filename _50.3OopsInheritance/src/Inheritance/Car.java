package Inheritance;

public class Car  extends Vahicle{

    String color;



    void start() {
        Scooter scooterobj = new Scooter();
        scooterobj.breaking(this);  // Passing the current object
        super.start();
        System.out.println(this);
        System.out.println(this.model + " Car is starting");
    }


    Car breaking(){
        return this;
    }

    Car(){
        super(3); // they should be in up
//        this(3) // u can't use both simultaneously
        System.out.println("Car is being created");
    }

    Car(int wheelsCount){

    }

    public static void main(String[] args) {
        Car obj = new Car();
        obj.accelerate();
//        System.out.println(obj.wheelsCount);
//        obj.wheelsCount = 4;
//        obj.model = "I10";
//        obj.color = "Red";
//        obj.start();
//        System.out.println(obj.wheelsCount);
    }

}


class Scooter{

    void breaking(Car car){
        System.out.println(car.model+ " is breaking");
    }
}