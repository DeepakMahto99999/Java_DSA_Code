// Write a  program to print all Armstrong numbers
// between 1 to n where n is the input
// given by the user.

import java.util.Scanner;

public class _6Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        // Loop through all numbers from 1 to the given number
        for (int i = 1; i <= number; i++) {
            int num = i;
            int n = num;
            int count = 0;

            // Count the number of digits in the number
            while (num > 0) {
                num /= 10;
                count++;
            }

//            count = (int) Math.log10(num) + 1;

            int Armstrong = 0;
            // Calculate the sum of powers of the digits
            while (n > 0) {
                int rem = n % 10;
                Armstrong += Math.pow(rem, count);
                n /= 10;
            }

            // Print the number if it's an Armstrong number
            if (Armstrong == i) {
                System.out.println(i);
            }
        }
    }
}
