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

    public static void copyStack2(Stack<Integer> original ,Stack<Integer> copy){
        if (original.isEmpty()) return;

        int val = original.pop();

//        copyStack2(original,copy);
//
//        original.push(val);
//        copy.push(val);

        copy.push(val);
        copyStack2(original, copy);
        original.push(val);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original Stack: " + st);

        Stack<Integer> copy = new Stack<>();
        copyStack2(st , copy);
        System.out.println("Copied Stack:   " + copy);


//        Stack<Integer> copiedStack = copyStack(st);
//        System.out.println("Copied Stack:   " + copiedStack);
    }
}
