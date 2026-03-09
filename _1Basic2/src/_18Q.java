//01010
//01010
//01010
//01010
//01010
//01010

import java.util.Scanner;

public class _18Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-1 ; j++) {
                if (j %2 ==0) {
                    System.out.print("1");
                }else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
