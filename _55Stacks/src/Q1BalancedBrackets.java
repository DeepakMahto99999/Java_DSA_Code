// Check whether a given brackets sequence is balanced or not
// str = "()(())"  --> True
// str = "(()()("  --> false
// str = "(()())"  --> True
// str = ")()())"  --> false
// str = "(())())" --> false

// approach
// 1.opening --> ( --> push
// 2.closing --> )
// a) st top --> ( --> pop
// b) if st is empty return false


import java.util.Scanner;
import java.util.Stack;

public class Q1BalancedBrackets {

    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
         int n = str.length();

        for (int i = 0; i < n ; i++) {
            char ch = str.charAt(i);
            if (ch == '(') {
                st.push(ch);
            }else {
                if (st.isEmpty()) return false;
                char top = st.peek();
                if (ch == ')' && top != '(') {
                    return false;
                }
                st.pop();
            }
        }
        return  (st.isEmpty());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
