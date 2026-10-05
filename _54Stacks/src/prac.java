import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class prac {

    public static void reverseStack(Stack<Integer> st){
       if (st.isEmpty()) return;

       int val = st.pop();

       System.out.print(val + " ");

       reverseStack(st);

       st.push(val);

     }

    public static Stack<Integer> reverseStack2(Stack<Integer> st){
     Stack<Integer> rev = new Stack<>();


     while (!st.isEmpty()){
         rev.push(st.pop());
     }

     Stack<Integer> rev2 = new Stack<>();
     while (!rev2.isEmpty()){
         st.push(rev2.pop());
     }
     return rev;
    }

    public static void main(String[] args){
      Stack<Integer> st = new Stack<>();
      st.push(1);
      st.push(2);
      st.push(3);
      st.push(4);
      System.out.println("Original Stack: " + st);

      Stack<Integer> s = reverseStack2(st);
      System.out.println("reversed Stack: " + s);

      reverseStack(s);

      System.out.println("Original Stack: " + st);

    }
}
