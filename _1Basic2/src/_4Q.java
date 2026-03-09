// Write a  program to find power of a number using for loop.

import java.util.Scanner;

public class _4Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power=1;


        System.out.println("Enter base number: ");
        int base = sc.nextInt();

        System.out.println("Enter power of  number ");
        int exponent = sc.nextInt();

        for (int i = 1; i <=exponent ; i++) {
            power *= base;
        }

        System.out.println("power of number is : " +   power);

    }
}
