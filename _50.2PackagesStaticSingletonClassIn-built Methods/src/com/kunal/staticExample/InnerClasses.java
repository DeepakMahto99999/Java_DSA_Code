package com.kunal.staticExample;


import java.util.Arrays;

public class InnerClasses {

static class Test {
    String name;

    public Test(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    }

    public static void main(String[] args) {
       Test a = new Test("kunal");
       Test b = new Test("deepak");

        System.out.println(a);

//        Arrays.toString(new int[]{3,4,5});
//        System.out.println(a.name);
//        System.out.println(b.name);
    }
}
