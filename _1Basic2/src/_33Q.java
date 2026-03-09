//5
//45
//345
//2345
//12345

import java.util.Scanner;

public class _33Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = n; i >=1 ; i--) {
//            for (int j = i; j <=n ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
