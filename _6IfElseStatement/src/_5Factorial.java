import java.util.Scanner;

public class _5Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for factorial: ");
        int n = sc.nextInt();
        if (n < 0){
            System.out.println("factorial is not difine for less than 0");
        } else {
            int fact = 1;
            for (int i = 1; i <=n ; i++) {
                fact *=i;
            }
            System.out.println(fact);
        }
    }
}
