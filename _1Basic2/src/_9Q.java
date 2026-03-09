// *****
// *   *
// *   *
// *   *
// *****

import java.util.Scanner;

public class _9Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        for (int i = 1; i <=r ; i++) {

            for (int j = 1; j <=r ; j++) {
                if (i ==1 || i ==r || j == 1 || j ==r) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }

            System.out.println();
        }

    }
}
