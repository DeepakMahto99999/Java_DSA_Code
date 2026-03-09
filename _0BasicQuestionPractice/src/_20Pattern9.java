import java.util.Scanner;

public class _20Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  *  _  _  _  *
//  _  *  _  *  _
//  _  _  *  _  _
//  _  *  _  *  _
//  *  _  _  _  *

        int n = sc.nextInt();;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i == j || i + j == n + 1) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
             }
            System.out.println();
        }


    }
}
