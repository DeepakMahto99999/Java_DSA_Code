import java.util.Scanner;

public class _23Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i == n && (j==1 || j==n) ||
                    i == 1 && (j==1 || j==n) ||
                    i >1 && i < n && (j >1 && j < n) ) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
