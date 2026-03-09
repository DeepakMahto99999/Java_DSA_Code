import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String a = "college";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);

        // arr = {1,2,3} , arr[0]
       char ch = s.charAt(0);
       System.out.println(ch);
//        for(int i=0; i < s.length();i++){
//            System.out.println(s.charAt(i));
//        }
        System.out.println(s.substring(2,4));  // 2,3
    }
}