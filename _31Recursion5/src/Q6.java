
public class Q6 {

    // Method to recursively convert a number to binary
    public static void toBinary(int n) {
        // Base case: If the number is 0, stop the recursion
        if (n == 0) {
            return;
        }

        // Recursively divide by 2 and call the method on the quotient
        toBinary(n / 2);

        // Print the remainder (binary digit) in reverse order
        System.out.print(n % 2);

    }

    public static void main(String[] args) {
        int number = 7;  // Example number to convert to binary
        toBinary(number);
    }
}
