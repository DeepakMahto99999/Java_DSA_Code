import java.util.Scanner;

public class _16Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//      *	*	*	*	*
//          *	*	*	*
//              *	*	*
//                	*	*
//                      *


        int n =sc.nextInt();
        int str =n;
        int spc =0;
        for (int i = 1; i <=n ; i++) {
//            System.out.println(str+ "" +spc);
            for (int j = 1; j <=spc ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=str ; j++) {
                System.out.print("*\t");
            }
            str--;
            spc++;
            System.out.println();
        }
    }
}
