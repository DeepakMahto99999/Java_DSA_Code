
public class Q5Sir {

    static void reverseWordInsentence(String str){
        String ans = "";
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }else{ // ch ==' '
                sb.reverse();
                ans +=sb;
                ans += " ";
//                sb.delete(0,sb.length());
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "I am an online educator";
        reverseWordInsentence(str);
    }
}
