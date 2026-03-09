//Write a C++ program to input two numbers from
// user and find maximum between two numbers using switch case.

import java.util.Scanner;

public class _40Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter your first number: ");
        int num2 = sc.nextInt();

        switch (num1 > num2 ? 1 : 0){
            case 0:
                System.out.println(num2 + "is maximum");
                break;

            case 1:
                System.out.println(num1 + "is maximum");
        }
    }
}
