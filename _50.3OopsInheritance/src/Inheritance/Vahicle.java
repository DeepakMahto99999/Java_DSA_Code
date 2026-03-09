package Inheritance;

public class Vahicle {

   final  int gears = 4 ;



    public static void main(String[] args) {
        Vahicle v1 = new Vahicle(2);
//        v1.gears = 6;
    }

    int wheelsCount;

    String model;

    Vahicle(){
        System.out.println("Creating a vehicle instance");
    }

    Vahicle(int wheelsCount){
        this.wheelsCount = wheelsCount;
        System.out.println("Creating vehicle with wheels");
    }

    void start(){
        System.out.println("vehicle is starting ");
    }


   final void accelerate(){
        System.out.println("Vehicle is accelerating");
    }
}
