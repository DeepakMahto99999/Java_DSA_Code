import java.util.Scanner;

public class ConditionalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

//        if(num % 2 ==0 && num % 3 == 0){
//            System.out.println("found ans -" + num);
//        }

        String ans;
        ans = (num % 2 ==0 && num % 3 == 0) ?  "found ans -" + num:"not divisible";
        System.out.println(ans);
    }
}
