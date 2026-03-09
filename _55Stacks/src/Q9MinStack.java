// Min Stack
// Approach -1 :-
// Use two stacks: `st` to store actual values, and `min` to store the current minimum value at each level.

// Logic:
// 1. When pushing a new element:
//    - Push it to the `st` stack.
//    - Push the **minimum of (current element and top of min stack)** to      the `min` stack.
//      This ensures that the top of `min` always has the minimum so far.

// 2. When popping:
//    - Pop from both `st` and `min` stacks to keep them in sync.

// 3. To get the current minimum:
//    - Simply return the top of `min` stack.

// 4. To get the top element:
//    - Return the top of `st` stack.


// Approach - 2 :
// trick = x - oldMin
// min = x  // because we had updated min = x when pushing
//        oldMin = min - trick
//        = x - (x - oldMin)
//        = oldMin ✅

// Old min = 5
// New x = 2
//        st.push(x - min) = 2 - 5 = -3
//        min = 2
//        trick = -3
//        min = 2
//        oldMin = min - trick = 2 - (-3) = 2 + 3 = 5 ✅


import java.util.Stack;
public class Q9MinStack {

    // ✅ Approach 1: Using Two Stacks
    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> min = new Stack<>();

    // Add an element to the top of the Stack
    public static void push(int x) {
        st.push(x);
        if (min.isEmpty() || x <= min.peek()) {
            min.push(x);
        } else {
            min.push(min.peek());
        }
    }

    // Remove the top element from the Stack
    public static void pop() {
        if (!st.isEmpty()) {
            st.pop();
            min.pop();
        }
    }

    // Returns top element of the Stack
    public static int peek() {
        if (!st.isEmpty()) {
            return st.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    // Finds the minimum element of the Stack
    public static int getMin() {
        if (!min.isEmpty()) {
            return min.peek();
        }
        throw new RuntimeException("Stack is empty");
    }

    // ✅ Approach 2: Using One Stack and an Integer
    public class solution {

        Stack<Integer> st = new Stack<>();
        int min = -1;

        // Add an element to the top of the Stack
        public void push(int val) {
            if (st.isEmpty()) {
                st.push(val);
                min = val;
            } else if (val >= min) {
                st.push(val);
            } else {
                st.push(val - min); // Store fake value
                min = val;
            }
        }

        // Remove the top element from the Stack
        public void pop() {
            if (st.isEmpty()) return;

            if (st.peek() >= min) {
                st.pop();
            } else {
                int oldMin = min;
                min = min - st.peek(); // Recover previous min
                st.pop();
            }
        }

        // Returns top element of the Stack
        public int peek() {
            if (st.isEmpty()) return -1;
            if (st.peek() >= min) {
                return st.peek();
            } else {
                return min;
            }
        }

        // Finds the minimum element of the Stack
        public int getMin() {
            if (st.isEmpty()) return -1;
            return min;
        }
    }

    // ✅ Main method to test both approaches
    public static void main(String[] args) {
        System.out.println("---- Testing Approach 1 (Two Stacks) ----");
        push(5);
        push(3);
        push(7);
        push(2);
        System.out.println("Top Element: " + peek());     // 2
        System.out.println("Minimum: " + getMin());       // 2
        pop();
        System.out.println("Top Element: " + peek());     // 7
        System.out.println("Minimum: " + getMin());       // 3

        System.out.println("\n---- Testing Approach 2 (Single Stack + Int) ----");
        Q9MinStack outer = new Q9MinStack();
        solution minStack = outer.new solution();

        minStack.push(5);
        minStack.push(3);
        minStack.push(7);
        minStack.push(2);
        System.out.println("Top Element: " + minStack.peek());     // 2
        System.out.println("Minimum: " + minStack.getMin());       // 2
        minStack.pop();
        System.out.println("Top Element: " + minStack.peek());     // 7
        System.out.println("Minimum: " + minStack.getMin());       // 3
    }
}
