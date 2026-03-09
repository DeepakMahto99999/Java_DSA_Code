import java.util.Scanner;

public class _1BitFlipCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number (x): ");
        int x = sc.nextInt();
        System.out.print("Enter second number (y): ");
        int y = sc.nextInt();

        // XOR to find differing bits
        int xor = x ^ y;

        // Count set bits in XOR result
        int count = 0;
        while (xor > 0) {
            count += xor & 1;
            xor >>= 1;
        }

        // Output
        System.out.println("Number of bits to flip: " + count);
    }
}