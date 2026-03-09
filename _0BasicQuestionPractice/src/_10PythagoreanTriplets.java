import java.util.Scanner;

public class _10PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Identify the greatest number
        int gre, small1, small2;
        if (a >= b && a >= c) {
            gre = a;
            small1 = b;
            small2 = c;
        } else if (b >= a && b >= c) {
            gre = b;
            small1 = a;
            small2 = c;
        } else {
            gre = c;
            small1 = a;
            small2 = b;
        }


        // Check for Pythagorean triplet
        if (small1 * small1 + small2 * small2 == gre * gre) {
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
