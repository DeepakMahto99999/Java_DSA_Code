import java.util.Scanner;

public class _6RotateNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r =sc.nextInt();
        for (int i = r; i <=r; i++) {
            int t =n % (int)Math.pow(10,i);


            for (int j = 1; j <= 1; j++) {
               n/=(int)Math.pow(10,i);
                System.out.println(t+""+n);
            }
        }
      
    }
}
