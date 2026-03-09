//  program to input a number and find the sum of first and
//  last digit of the number using a for loop.

import java.util.Scanner;

public class _1Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int firstdigit = 0;

       int lastDigit = num % 10;

//        while(num > 0){
//            firstdigit = num % 10;
//            num = num / 10;
//        }

        while (num >= 10) {
            num = num / 10;
        }

      int result = lastDigit + firstdigit;
      System.out.println(result);

    }
}
