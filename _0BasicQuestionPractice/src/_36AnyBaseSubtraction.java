import java.util.Scanner;

public class _36AnyBaseSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b =sc.nextInt();
        int n1 =sc.nextInt();
        int n2 =sc.nextInt();

        int carry = 0;
        int power =1;
        int result =0;

        if (n1 >= n2 ){
            while(n1 > 0 || n2 > 0 ){
                int digit1 = (n1 % 10) + carry;
                int digit2 = n2 % 10;

                n1/=10;
                n2/=10;

                if (digit1 <= digit2){
                    digit1 = digit1 + b;
                    carry = -1;
                } else {
                    carry=0;
                }

                int difference = digit1 - digit2;
                result += difference * power;
                power *=10;

            }
            System.out.println(result);
        } else {
            System.out.println(n1 + " should be grater than " + n2);
        }
    }
}
