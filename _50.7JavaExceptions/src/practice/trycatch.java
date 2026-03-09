package practice;

import java.util.Scanner;

public class trycatch {

    public static void main(String[] args) {

        int[] a = new int[5];

//        System.out.println("nitesh chutiya");
//
//        try {
//            int b = 5/0;
//        System.out.println(a[33]);
//        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
//            System.out.println(e);
//        }
//
//        System.out.println("nitesh jh2");

        try {
        printArray(a);
        }catch (Exception e){
            System.out.println("Throw an custom expression" + e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age ");

        try {
            int age = sc.nextInt();
           if(age > 100){
               throw new MyException("my error");
           }
        }
        catch (Exception e) {
            System.out.println(e);
        }

    }

    static int printArray(int[] a) throws Exception{
        return  a[8];
    }

    static class MyException extends Exception {
     public MyException(String message){
         super(message);
     }
    }
}
