
public class interning {

    public static void main(String[] args) {
        String s = "Hello";  // -> Heylo // 2
        String x = "Hello";
        x = "Mello";
//        System.out.println(x);
//        System.out.println(s);
//        s.charAt(0) = 'q';  // this is immutable of string
         s = s.substring(0,2) + 'y' + s.substring(3);
        System.out.println(s);
    }
}
