import java.util.Scanner;

public class _12BenjaminBulbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n =sc.nextInt();
//       for(int i=1 ; i *i <=n ; i++){
//           System.out.println(i*i);
//       }


        int n = sc.nextInt();

        for (int i = 1;i<=n;i++){

            for (int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }


            System.out.println();
        }
    }
}




