import java.util.Scanner;

public class _18Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  *  _  _  _  _
//  _  *  _  _  _
//  _  _  *  _  _
//  _  _  _  *  _
//  _  _  _  _  *

        int n =sc.nextInt();



//        for (int i =1 ; i <=n ; i++) {
////            System.out.println(sp + ","+ st + ","+sp2);
//            for (int j = 1; j < i ; j++) {
//                System.out.print("\t");
//            }
//                System.out.print("*\t");
//            for (int j = i + 1; j <= n; j++) {
//                System.out.print("\t");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i == j) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
