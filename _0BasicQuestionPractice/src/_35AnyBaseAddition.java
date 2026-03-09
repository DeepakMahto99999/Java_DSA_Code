import java.util.Scanner;

public class _35AnyBaseAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read base, first number, and second number
        int base = sc.nextInt();
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        // Call the base addition function
        int result = addNumbersInBase(n1, n2, base);
        System.out.println(result);
    }

    // Function to add two numbers in any base
    public static int addNumbersInBase(int n1, int n2, int base) {
        int carry = 0;
        int place = 1;
        int result = 0;

        // Continue as long as there are digits left in either number or there's a carry
        while (n1 > 0 || n2 > 0 || carry > 0) {
            // Get the last digit of each number
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;

            // Remove the last digit from each number
            n1 /= 10;
            n2 /= 10;

            // Calculate the sum of the digits and carry
            int sumdigit = digit1 + digit2 + carry;
            carry = sumdigit / base; // Update carry for the next iteration
            int newdigit = sumdigit % base; // Get the current digit in the given base

            // Update the result with the new digit at the correct place
            result += (newdigit * place);
            place *= 10; // Move to the next higher place value
        }

        return result;
    }
}
