// Remove all the occurences of 'a' from string s ="abcax".


public class Q1 {

    static void removeA(String s) {
        int n = s.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != 'a') {
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }

    static String removeCharA(String s , int idx){
        int n = s.length();
        if(idx > n) return "";

        String smallAns = removeCharA(s,idx+1);
        char currChar = s.charAt(idx);
        if(currChar != 'a'){
            return currChar + smallAns;
        } else {
            return smallAns;
        }
    }

    static String removeA2(String s){
        if(s.length() == 0) return "";
        String smallAns = removeA2(s.substring(1));

        char currChar = s.charAt(0);
        if (currChar != 'a') {
            return currChar + smallAns;
        } else{
            return smallAns;
        }
    }

    public static void main(String[] args) {
        String s = "aryan";
        removeA(s);
        System.out.println(removeCharA(s, 0));
        System.out.println(removeA2(s));
    }
}