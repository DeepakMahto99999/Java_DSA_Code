//11111
//2222
//333
//44
//5


import java.util.Scanner;

public class _28Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
