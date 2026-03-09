// Given a number n , check whether it 's prime or not

public class Q5{

    // Recursive function to check if n is prime
    static boolean isPrime(int n, int i) {
        // Base case: if n is divisible by i, it's not prime
        if (n % i == 0) {
            return false;
        }

        // Stopping condition: if i * i exceeds n, it's prime
        if (i * i > n) {
            return true;
        }

        // Recursive case: check for the next divisor i + 1
        return isPrime(n, i + 1);
    }

    public static void main(String[] args) {
        int n = 29;
        // Start recursion with i = 2
        if (isPrime(n, 2)) {
            System.out.println(n + " is prime.");
        } else {
            System.out.println(n + " is not prime.");
        }
    }
}
