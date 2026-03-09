import java.util.Scanner;

public class _5Q {
    public static void main(String[] args) {
        int i, j, num, isPrime;

        // Input a number from the user
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter any number to print Prime factors:");
        num = scanner.nextInt();

        System.out.println("All Prime Factors of " + num + " are:");

        // Find all Prime factors
        for (i = 2; i <= num; i++) {
            // Check 'i' for a factor of num
            if (num % i == 0) {
                // Check 'i' for Prime
                isPrime = 1;
                for (j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        isPrime = 0;
                        break;
                    }
                }

                // If 'i' is a Prime number and factor of num
                if (isPrime == 1) {
                    System.out.print(i + ", ");
                }
            }
        }

        scanner.close();
    }
}
