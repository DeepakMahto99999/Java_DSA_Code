import java.util.Scanner;

public class _5Inverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        // op = original position
        // od = original  digit
        // id = inverted digit
        // ip =inverted position
         // 1 2 3 4 5      - index
         // 5 4 3 3 1      - number


        int inv =0;
        int op =1;

        while(n!=0){
           int od = n %10;
           int id =op;
           int ip =od;

           // make change to inv using ip and id
            inv = inv + id*(int)Math.pow(10,ip-1);
            n = n /10;
            op++;
        }
        System.out.println(inv);
    }
}