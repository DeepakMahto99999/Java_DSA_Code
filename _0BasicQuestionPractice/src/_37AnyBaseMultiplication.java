import java.util.Scanner;

public class _37AnyBaseMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt(); // Base
        int n1 = sc.nextInt(); // First number
        int n2 = sc.nextInt(); // Second number

        int product = getProduct(b, n1, n2);
        System.out.println(product);
    }

    public static int getProduct(int b, int n1, int n2) {
        int result = 0;
        int power = 1;

        while (n2 > 0) {
            int digit2 = n2 % 10;
            n2 /= 10;

            // Multiplying n1 with the current digit of n2
            int sprd = getProductSingleDigit(b, n1, digit2);
            // Adding to the result with appropriate power of 10

            result = getSum(b, result, sprd * power);
            power *= 10;
        }

        return result;
    }

    public static int getProductSingleDigit(int b, int n1, int digit2) {
        int power = 1;
        int result = 0;
        int carry = 0;

        while (n1 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            n1 /= 10;

            int product = digit1 * digit2 + carry;
            carry = product / b;
            int place = product % b;

            result += place * power;
            power *= 10;
        }

        return result;
    }

    public static int getSum(int b, int n1, int n2) {
        int result = 0;
        int carry = 0;
        int place = 1;

        while (n1 > 0 || n2 > 0 || carry > 0) {
            int digit1 = n1 % 10;
            int digit2 = n2 % 10;

            n1 /= 10;
            n2 /= 10;

            int sumdigit = digit1 + digit2 + carry;
            carry = sumdigit / b;
            int newdigit = sumdigit % b;

            result += (newdigit * place);
            place *= 10;
        }

        return result;
    }
}
