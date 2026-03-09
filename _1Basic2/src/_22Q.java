//10001
//01010
//00100
//01010
//10001

import java.util.Scanner;

public class _22Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=n ; j++) {
//                if (i == 1 && (j==1 || j==n) ||
//                i==n &&(j==1 || j==n) || i == (n+1)/2 && (j==(n+1)/2)
//                || i%2==0 && (j%2==0)) {
//                    System.out.print("1");
//                } else {
//                    System.out.print("0");
//                }
//            }
            for (int j = 1; j <=n ; j++) {
                if (i == j ||(j == (n +1)-i)) {
                    System.out.print("1");
                } else{
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}
