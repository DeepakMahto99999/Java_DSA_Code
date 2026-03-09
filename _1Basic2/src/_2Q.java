//program to input a number from
//the user and calculate product of its digits.

import java.util.Scanner;

public class _2Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product =1;
        // Set product to 0 if the number is 0, otherwise initialize to 1
        product = (n == 0 ? 0 : 1);

        while (n > 0){
            product*= n % 10;
            n /=10;
        }
        System.out.println(product);
    }
}
