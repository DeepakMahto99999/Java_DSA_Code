// Count the number of palindromic substrings
public class Q3 {

    static void palindrome(String str){
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr + "";
        if(str.equals(s)){
            System.out.println("palindrome");
        } else{
            System.out.println("Not plaindrome");
        }
    }

    static void palindrome2(String str) {
        int i = 0;
        int j = str.length() - 1;
        boolean flag = true;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                flag = false; // Found mismatch, not a palindrome
                break;
            }
            i++;
            j--;
        }

        if (flag) // Correct condition to check palindrome
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }



    public static void main(String[] args) {
       String str = "aba";
//       palindrome(str);
        palindrome2(str);
    }
}
