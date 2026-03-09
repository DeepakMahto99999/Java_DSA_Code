import java.util.Stack;

public class insertionInStack {


    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original Stack: " + st);

        int idx = 2;
        int x = 7;

        Stack<Integer> i = new Stack<>();
        while (st.size() > idx){
            i.push(st.pop());
        }
        st.push(x);

        while (i.size() > 0){
            st.push(i.pop());
        }

        System.out.println(st);
    }
}
