//Write a  program to input number
// from user and check whether the number
// is even or odd using switch case.

import java.util.Scanner;

public class _41Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num%2==0 ? 1 :0){
            case 1:
                System.out.println(num + "  is an even number");
                break;
            case 0:
                System.out.println(num + " is a odd number");
        }
    }
}
