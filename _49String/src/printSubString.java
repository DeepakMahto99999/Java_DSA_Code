// Given a string s . print all the substrings of s.

public class printSubString {

    static void printStringFor(String s ){
        int n = s.length();
        for (int i = 0; i < n; i++) {  // Starting index
            for (int j = i; j < n; j++) {  // Ending index
                // Print characters one by one instead of using substring()
                for (int k = i; k <= j; k++) {
                    System.out.print(s.charAt(k));
                }
                System.out.print(" "); // Move to the next line
            }
        }

    }
    
    static void printString(String s){
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(s.substring(i , j+1));
            System.out.print(" ");
            }
        }
    }

    static void printString2(String s){
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.print(s.substring(i , j));
                System.out.print(" ");
            }
        }
    }


    public static void main(String[] args) {
        String s = "abcd";
//        printStringFor(s);
//        printString(s);
        printString2(s);
    }
}

