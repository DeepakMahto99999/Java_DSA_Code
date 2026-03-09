import java.util.Scanner;

public class _7GcdAndLcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int gcd =1;
        for (int i = 2; i <= Math.min(first, second); i++) {
            if (first % i == 0 && second % i == 0) {
               gcd =i;
                }
            }
        int lcm = (first * second) / gcd;
        System.out.println("The greatest common divisor is : " +gcd);
        System.out.println("The least common divisor is : " +lcm);
        }

    }

