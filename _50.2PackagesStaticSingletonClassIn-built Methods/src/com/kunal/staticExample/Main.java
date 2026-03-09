package com.kunal.staticExample;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Human.population);
//        Human kunal = new Human(22,"Kunal kushwaha",10000,false);
//
//        System.out.println(Human.population);
//        Human rahul = new Human(22,"Kunal kushwaha",10000,false);
//        System.out.println(Human.population);

        Main s1 = new Main();
        s1.greeting();

        Main obj = new Main();
        obj.fun2();
    }

    // this is not dependent on objects
    static void fun(){
//        greeting(); // you cant use this because it requires an instance
        // but the function you are using it in does not depend an instances

        // you cannot access non static stuff without references their
        // instances in a static context

        //hence, here I am referecing it
        Main s1 = new Main();
        s1.greeting();
    }

    void fun2(){
        greeting();
    }

    // we know that something which is not static, belong to an object
    void greeting() {
        fun();
        System.out.println("Hello world");
    }

}
