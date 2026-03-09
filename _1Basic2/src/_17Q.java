//11111
//00000
//11111
//00000
//11111
//00000

import java.util.Scanner;

public class _17Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for(int j = 1; j <=n-1 ; j++) {
               if (i % 2 == 0){
                   System.out.print("0");
               } else {
                   System.out.print("1");
               }
            }
            System.out.println();
        }
    }
}
