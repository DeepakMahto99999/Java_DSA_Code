package OOPSinJAVA;

import java.util.Scanner;

// create data type
public class StudentClass {

   // creating a new data type


    public static class Car{
        String name;
        String type;
       private int price;
    }

    public static void fun(Student x){
        System.out.println(x.name);
        return;
    }

    public static void change(Student s){
       s.name = "Rohan";
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.name = "Alto";
        c1.price = 400000;
        c1.type = "hatchback";
        System.out.println(c1.price);

//        Scanner sc = new Scanner(System.in);
//        int z = sc.nextInt();
//        Student s1 = new Student(); // declaration
        //  Initialization
//        s1.name = "Deepak";
//        s1.percent = 56.68;
//        s1.rno = 76;
//        System.out.println(s1.getRno());
//        s1.setRno(76);
//        System.out.println(s1.getRno());

//        Student s = new Student();
//        s.name = "Akshit";
//        s.percent = 97.2;
//        s.rno = 3;
//        System.out.println(s.name);
//        s.name = "Rahul";
//        System.out.println(s.name);
//        change(s);
//        System.out.println(s.name);
//        fun(s);


    }
}
