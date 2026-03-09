import java.util.Scanner;

public class _34AnyBaseToBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int b =sc.nextInt();
        int b2 =sc.nextInt();
        int db = getBaseValue(n,b);
        int bd = getBase2Value(db,b2);
        System.out.println(bd);

    }
        public static int getBaseValue(int n , int b){
            int rev =0;
            int power =1;

            while(n > 0){
                int digit = n % 10;
                rev += digit *power;
                n/=10;
                power =power*b;
            }


       return rev;
    }
     public static int getBase2Value(int db , int b2){
        int rev =0;
        int power=1;
        while (db > 0){
            int digit2 = db % b2;
            db/=b2;
            rev += digit2 * power;
            power *=10;

        }
       return rev;
    }
}
