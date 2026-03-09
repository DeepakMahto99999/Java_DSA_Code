import pw.skills.App;

public class OutsidePWSkills {


    public static void main(String[] args) {
        App obj =new App();
        System.out.println("Outside package,non-child class "+obj.str_1);

        App3 obj3 = new App3();
        obj3.printFromChildClass();
    }
}

// child class
class App3 extends App{
 void printFromChildClass(){
     App3 obj3 = new App3();
     System.out.println("Child Class: "+obj3.str_1);
    }
}