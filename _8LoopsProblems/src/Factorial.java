import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = 1;
        if(n==1 || n ==0){
            System.out.println(n);
        } else {
            for(int i = 2; i <= n; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}
