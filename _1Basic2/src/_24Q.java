//12345
//23456
//34567
//45678
//56789

import java.util.Scanner;

public class _24Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=  i+n-1 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
