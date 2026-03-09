import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        if(num%2==0){
//            System.out.println("the number is even");
//        } else{
//            System.out.println("the number is odd");
//        }

        String ans;
         ans =  (num % 2 == 0) ? "even":"odd";
        System.out.println(ans);
    }
}
