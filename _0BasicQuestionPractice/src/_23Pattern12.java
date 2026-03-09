import java.util.Scanner;

public class _23Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  0
//  1    1
//  2    3    5
//  8    13   21   24
//
        int n =sc.nextInt();
         int a =0;
         int b =1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(a + "\t");
                int c = a + b;
                a = b;
                b=c;
            }
            System.out.println();
        }
    }
}
