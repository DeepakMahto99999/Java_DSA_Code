class Algebraa{
    int a =10; // member variables
     int b =5; //

    int add(){
       int p =100;
       int q =20;
       return p + q;
    }

    int sub(){
        int p =67;
        int q =20;
        return p - q;
    }

    void demo(){
        int a =5;
        System.out.println(a);
//        System.out.println(d);
        for (int i = 0; i < 5; i++)
        {
            System.out.println(i);
            int d =10;
            System.out.println(d);

        }
//        System.out.println(d);
       for (int i =0; i < 2 ; i++)
        {
            System.out.println(i);
            int d =100;
            System.out.println(d);
        }

    }

    static void changeValue(int a){
        a *=100;
        System.out.println("inside change value "+a);
    }

}


public class Main1 {

//   static void changeValue(int a){
//        a *=100;
//       System.out.println("inside change value "+a);
//    }


    public static void main(String[] args) {
//    Algebraa obj = new Algebraa();
//    obj.demo();

        int a =10;
        System.out.println("Before Changing value "+a);
        Algebraa.changeValue(a);
//        obj.changeValue(a);
        System.out.println("After Changing value "+a);
    }
}








//class Algebraa {
//    // Static method
//    static void changeValue(int a) {
//        a *= 100;
//        System.out.println("Inside Algebraa's changeValue: " + a);
//    }
//
//    // Non-static method
//    void changeNonStaticValue(int a) {
//        a *= 100;
//        System.out.println("Inside Algebraa's non-static changeValue: " + a);
//    }
//}
//
//public class Main1 {
//    // Static method
//    static void changeValue(int a) {
//        a *= 100;
//        System.out.println("Inside Main1's changeValue: " + a);
//    }
//
//    // Non-static method
//    void changeNonStaticValue(int a) {
//        a *= 100;
//        System.out.println("Inside Main1's non-static changeValue: " + a);
//    }
//
//    public static void main(String[] args) {
//        int a = 10;
//        System.out.println("Before changing value: " + a);
//
//        // Call static method in Algebraa class
//        Algebraa.changeValue(a);
//
//        // Call static method in Main1 class
//        changeValue(a);
//
//        // Call non-static method in Algebraa class
//        Algebraa obj = new Algebraa();
//        obj.changeNonStaticValue(a);
//
//        // Call non-static method in Main1 class
//        Main1 mainObj = new Main1();
//        mainObj.changeNonStaticValue(a);
//
//        System.out.println("After changing value: " + a);
//    }
//}
