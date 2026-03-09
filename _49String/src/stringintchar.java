import java.util.Scanner;

public class stringintchar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = "abc";
//        str +=  "xyz";
//        str += 'r';
//        str += 10;
//        System.out.println(str);
        System.out.println("abc" + "def");
        System.out.println("abc" + 10 + 20);
        System.out.println("abc" + (10+20) );
        System.out.println(10+20+"abc");

    }
}
