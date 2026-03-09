// *****
// ** **
// * * *
// ** **
// *****



import java.util.Scanner;

public class _10Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {

//            for (int j = 1; j <=n ; j++) {
//                if (i==1 || i ==n ) {
//                    System.out.print("*\t");
//                } else if (i == 2 || i == n-1) {
//                    if ( j==3 ) {
//                        System.out.print("\t");
//                    } else {
//                        System.out.print("*\t");
//                    }
//                } else{
//                    if (j%2!=0){
//                        System.out.print("*\t");
//                    }else {
//                        System.out.print("\t");
//                    }
//                }
//            }

            for (int j = 1; j <= n; j++) {
                // Print star for conditions:
                // 1. first row (i == 1)
                // 2. last row (i == N)
                // 3. first column (j == 1)
                // 4. last column (j == N)
                // 5. diagonal (i == j)
                // 6. anti-diagonal (j == N - i + 1)
                if (i == 1 || i == n || j == 1 || j == n || i == j || j == (n - i + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
