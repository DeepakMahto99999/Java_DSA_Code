// count palindrome string or not

public class Q4 {

    public static boolean isPalindrome(String s){
        int i =0;
        int j = s.length()-1;
        while (i < j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void subString(String s){
        int n = s.length();
        int count =0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n ; j++) {
               if(isPalindrome(s.substring(i,j))==true){
                   System.out.print(s.substring(i,j) + " ");
                   count++;
               }
            }
        }
        System.out.println("\nThe number of palindromic substring: " + count);
    }

    public static void main(String[] args) {
        String str = "abbd";
        subString(str);
    }
}
