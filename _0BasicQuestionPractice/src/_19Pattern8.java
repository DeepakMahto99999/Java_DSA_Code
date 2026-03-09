import java.util.Scanner;

public class _19Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//  _  _  _  _  *
//  _  _  _  *  _
//  _  _  *  _  _
//  _  *  _  _  _
//  *  _  _  _  _

        int n =sc.nextInt();
        int tab =n-1;


        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=tab; j++) {
                System.out.print("\t");
            }

            System.out.print("*");

            System.out.println();
            tab--;
        }

    }
}
