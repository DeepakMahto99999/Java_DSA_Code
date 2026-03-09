package practice;

public class Lamp {

    String name;
    boolean isOn;

    Lamp(String name){
        this.name = name;
    }

   void turnOn(){
        isOn = true;
       System.out.println(name + "on? " + isOn);
   }

    void turnOff() {
        isOn = false;
        System.out.println(name + " on? " + isOn);
    }

    public static void main(String[] args) {

        Lamp led = new Lamp("led");
        Lamp halogen = new Lamp("halogen");

        led.turnOff();
        halogen.turnOn();

    }
}
