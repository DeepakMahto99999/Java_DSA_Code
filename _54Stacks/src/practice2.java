import java.util.Scanner;
import java.util.Stack;

public class practice2 {

    public static Stack<Integer> copyStack(Stack<Integer> s ){
        Stack<Integer> t = new Stack<>();

        while (!s.isEmpty()){
            t.push(s.pop());
        }

        Stack<Integer> st = new Stack<>();
          while (!t.isEmpty()){
              int x = t.pop();
              s.push(x);
              st.push(x);
          }

          return st;

    }

    public static void displayStack(Stack<Integer> s ){
        if (s.isEmpty()) return;
        int top = s.pop();
        displayStack(s);
        System.out.print(top + " ");
        s.push(top);
    }

    public static void removeFromIndex(Stack<Integer> b, int idx) {
        Stack<Integer> a = new Stack<>();
        // Move elements above the target index to temp stack
        while (b.size() > idx + 1) {
            a.push(b.pop());
        }
        // Remove the element at the index
        if (!b.isEmpty()) {
            b.pop();
        }

        // Push elements back to original stack
        while (!a.isEmpty()) {
            b.push(a.pop());
        }
        System.out.println();
    }

    public static void insertFromIndex(Stack<Integer> b, int idx , int x){
        Stack<Integer> st = new Stack<>();

        while (b.size() > idx){
            st.push(b.pop());
        }

        if (!b.isEmpty()) {
            b.push(x);
        }

        while (!st.isEmpty()){
            b.push(st.pop());
        }
    }


    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(5);
        st.push(6);
        st.push(7);
        st.push(12);
        st.push(20);
        st.push(99);
        System.out.println(st);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many element want to insert: ");
//        int n = sc.nextInt();
//
//        for (int i = 0; i < n; i++) {
//          int x = sc.nextInt();
//          st.push(x);
//        }
//        System.out.println(st);

        Stack<Integer> s = copyStack(st);
        System.out.println(s);

//       while (!st.isEmpty()){
//           s.push(st.pop());
//       }

//        int n = st.size();
//        for (int i = 0; i < n; i++) {
//            s.push(st.pop());
//        }
//
//        System.out.println(s);
//        System.out.println(st);
//        int t = s.size();
//        for (int i = 0; i < t; i++) {
//            st.push(s.pop());
//        }
//        System.out.println(st);

//        Stack<Integer> copiedStack = copyStack(st);
//        System.out.println("Copied Stack:   " + copiedStack);

        displayStack(st);

//        removeFromIndex(st,3);
//        System.out.println("removing index element: "+st);

        insertFromIndex(st,3,28);
        System.out.println(st);
    }
}
