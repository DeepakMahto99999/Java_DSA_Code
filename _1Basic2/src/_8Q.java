// Write a  program to print all strong
// numbers between 1 to n where n is the input given by the user.

// A strong number is a special number whose sum of factorial of
// digits is equal to the original number.
// For example: 145 is a strong number. Since, 1! + 4! + 5! = 145


import java.util.Scanner;

public class _8Q {

    int factorial(int num){
        int fact = 1;
        for (int i = 1; i <=num ; i++) {
            fact*=i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      _8Q obj = new _8Q();


        for (int i = 1; i <=n ; i++) {
               int num = i;
             int strong = 0;
               while(num > 0){
                   int rem = num % 10;
                   int result= obj.factorial(rem);
                   strong+=result;
                   num/=10;
               }
            if (i == strong) {
                System.out.println(i);
            }
        }

    }
}
