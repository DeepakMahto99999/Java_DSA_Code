import java.util.Scanner;

public class _32DecimalToAnyBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =sc.nextInt();
        int b = sc.nextInt();
        int dn = getValueInbase(n,b);
        System.out.println(dn);
    }

    public static int getValueInbase(int n , int b){
        int rv =0;
        int p =1;
        while (n > 0){
            int digit = n % b;
            n = n /b;

            rv += digit * p;
            p = p *10;
        }
        return rv;
    }
}
