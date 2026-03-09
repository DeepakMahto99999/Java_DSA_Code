public class Q3{

    // Function to calculate the power of a digit
    static int power(int base, int exp) {
        if (exp == 0) {
            return 1;
        }
        return base * power(base, exp - 1);
    }

    // Recursive function to calculate the sum of digits raised to the power
    static int calculateSum(int num, int power) {
        if (num == 0) {
            return 0;
        }
        int digit = num % 10;
        return power(digit, power) + calculateSum(num / 10, power);
    }

    // Function to check if the number is Armstrong
    static boolean isArmstrong(int num) {
        int numberOfDigits = String.valueOf(num).length();
        int sum = calculateSum(num, numberOfDigits);
        return sum == num;
    }

    public static void main(String[] args) {
        int number = 153; // Change this number to test other values

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
