import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create Scanner instance

        System.out.print("Enter first number: ");
        int num_1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num_2 = sc.nextInt();


        int sum = num_1 + num_2; // calculate sum
        System.out.println("The addition of the two numbers is: " + sum);

    }
}
