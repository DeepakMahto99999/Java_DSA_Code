// Write a program to print reverse of a string using recursion
// Check palindrome or not

public class Q2 {

    static void revString(String s){
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i = n-1 ; i >=0; i--){
            ans.append(s.charAt(i));
        }
        System.out.print(ans+" ");
    }

    static String reverseString(String s , int idx){
        int n = s.length();
        if(idx == n) return "";

        String smallAns = reverseString(s,idx+1);

        return smallAns + s.charAt(idx);

    }

    static String reverseString2(String s){
        if(s.isEmpty()) return "";
        String smallAns = reverseString2(s.substring(1));
        return smallAns + s.charAt(0);
    }



    public static void main(String[] args) {
        String s = "level";
//        revString(s);
//        System.out.println(reverseString(s,0));
        String rev = reverseString(s,0);
        if(rev.equals(s)){
            System.out.printf(" %s is palindrome",s);
        } else{
            System.out.printf("%s is Not palindrome",s);
        }
    }
}
