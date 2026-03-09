//5
//44
//333
//2222
//11111


import java.util.Scanner;

public class _29Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            for(int j = 1; j <=i ; j++) {
//                System.out.print(n-i+1);
//            }
//            System.out.println();
//        }

        for (int i =n; i>=1; i--) {
            // Logic to print numbers
            for (int j = i; j <=n; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
