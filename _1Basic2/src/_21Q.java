//11011
//11011
//00000
//11011
//11011

import java.util.Scanner;

public class _21Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i =1; i <=n; i++){
            for (int j = 1 ; j<=n;j++){
                if (j == (n+1)/2 || i == (n+1)/2) {
                    System.out.print("0");
                } else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
