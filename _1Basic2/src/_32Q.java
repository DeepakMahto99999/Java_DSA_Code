//5
//54
//543
//5432
//54321


import java.util.Scanner;

public class _32Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for (int j = n; j >=n-i+1 ; j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        for (int i = 1; i <=n ; i++) {
            for (int j = n; j >=i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
