// Write a  program to input a number and
// check whether the number is a Perfect number or not.
//A perfect number is a positive integer that is equal to
// the sum of its proper positive divisors. A positive proper
// divisor is a positive divisor of a number, excluding itself.
// Sum of its proper divisors = 1 + 2 + 3 = 6.



import java.util.Scanner;

public class _7Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum =0;
        for (int i = 1; i <=num/2 ; i++) {
            if (num % i == 0) {
             sum +=i;
            }
        }
            if (num == sum) {
                System.out.println("this is perfect number: ");
            } else {
                System.out.println("this is perfect not number: ");
            }
    }
}
