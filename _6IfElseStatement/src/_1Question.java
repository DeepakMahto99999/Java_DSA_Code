import java.util.Scanner;

public class _1Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Read three numbers
        System.out.println("Enter first number: ");
        int first = sc.nextInt();

        System.out.println("Enter second number: ");
        int second = sc.nextInt();

        System.out.println("Enter third number: ");
        int third = sc.nextInt();

        // Initialize largest and smallest
        int largest = first;
        int smallest = first;

        // Compare with second number
        if (second > largest) {
            largest = second;
        }
        if (second < smallest) {
            smallest = second;
        }

        // Compare with third number
        if (third > largest) {
            largest = third;
        }
        if (third < smallest) {
            smallest = third;
        }

        // Output results
        System.out.println("The largest number is " + largest);
        System.out.println("The smallest number is " + smallest);
    }
}
