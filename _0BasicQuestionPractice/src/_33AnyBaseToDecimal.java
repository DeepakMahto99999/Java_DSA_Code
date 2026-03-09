import java.util.Scanner;

public class _33AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int b =sc.nextInt();
        int dn = getValueInbase(n,b);
        System.out.println(dn);
    }
    public static int getValueInbase(int n , int b){
       int decimal =0;
       int power =1;
       while(n > 0){
             int  digit = n % 10;
                decimal += digit * power;
                n /=10;
               power *=b;
       }
       return decimal;
    }
}
