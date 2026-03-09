import java.util.Scanner;

public class _18Pattern6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

//        *  *  *  _  *  *  *
//        *  *  _  _  _  *  *
//        *  _  _  _  _  _  *
//        *  *  _  _  _  *  *
//        *  *  *  _  *  *  *

        int n =sc.nextInt();

        int st =(n+1)/2;
        int sp =1;


        for (int i = 1; i <=n ; i++) {
//            System.out.println(st + ","+sp + ","+st);
            for (int j = 1; j <=st ; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <=sp ; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <=st ; j++) {
                System.out.print("*\t");
            }
            if(i<=(n/2)){
                st--;
                sp+=2;
            }
            else {
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}
