import java.util.Stack;

public class copyStack {

    public static Stack<Integer> copyStack(Stack<Integer> original) {
        Stack<Integer> rev = new Stack<>();
        Stack<Integer> copy = new Stack<>();

        // Move elements to temp to reverse
        while (!original.isEmpty()) {
            rev.push(original.pop());
        }

        // Move back to original and also to copy
        while (!rev.isEmpty()) {
            int val = rev.pop();
            original.push(val);
            copy.push(val);
        }

        return copy;

    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original Stack: " + st);

        Stack<Integer> copiedStack = copyStack(st);
        System.out.println("Copied Stack:   " + copiedStack);
    }
}
