import java.util.Scanner;

public class _1PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("The number is non-prime " + num);
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("The number is prime " + num);
            } else {
                System.out.println("The number is non-prime " + num);
            }
        }
    }
}
