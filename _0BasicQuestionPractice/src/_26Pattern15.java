import java.util.Scanner;

public class _26Pattern15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

//  _  _  1
//  _  2  3  2
//  3  4  5  4  3
//  _  2  3  2
//  _  _  1


     int n = sc.nextInt();

     int sp = n/2;
     int st =1;
     int val =1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=sp ; j++) {
                System.out.print("\t");
            }

            int cval =val;
            for (int j = 1; j <=st ; j++) {
                System.out.print(cval + "\t");

                if(j <= st /2){
                   cval++;
                } else {
                    cval--;
                }
            }


            if(i <=n/2) {
                sp--;
                st+=2;
                val++;
            } else{
                sp++;
                st-=2;
                val--;
            }

            System.out.println();
        }
    }
}
