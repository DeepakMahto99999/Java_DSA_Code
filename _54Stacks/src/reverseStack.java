import java.util.Stack;

public class reverseStack {


    public static void reverse(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        while (!st.isEmpty()) {
            rt.push(st.pop());
        }
        System.out.println("After first reverse (st → rt): " + rt);

        Stack<Integer> qt = new Stack<>();
        while (!rt.isEmpty()) {
            qt.push(rt.pop());
        }
        System.out.println("After second reverse (rt → qt): " + qt);

        while (!qt.isEmpty()) {
            st.push(qt.pop());
        }
        System.out.println("Original stack reversed back to st: " + st);
    }

    public static void pushAtBottom(Stack<Integer> s , int value) {
        if (s.isEmpty()) {
            s.push(value);
            return;
        }
        int top = s.pop();
        pushAtBottom(s , value);
        s.push(top);
    }


    public static void reverseStackRec(Stack<Integer> s){
        if(s.isEmpty()) return;
        int top = s.pop();
        reverseStackRec(s);
        pushAtBottom(s , top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original stack: " + st);


       // reverse(st);
        reverseStackRec(st);
        System.out.println(st);

    }
}
