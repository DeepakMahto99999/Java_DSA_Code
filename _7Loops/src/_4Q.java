//Create a program to calculate the sum of integers entered by the user
// until the user enters 0 or negative integer. Initialise a
// variable named total with value 0 at the beginning.

import java.util.Scanner;

public class _4Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true){
        int n = sc.nextInt();
            if ( n <= 0) {
                break;
            }
            sum +=n;
        }
            System.out.println(sum);

    }
}
