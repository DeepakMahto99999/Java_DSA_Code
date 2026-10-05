import java.util.Stack;

public class displayStack {

    public static void displayReverseRec(Stack<Integer> s){
        if(s.isEmpty()) return;
        int x = s.pop();
        System.out.print(x+" ");
        displayReverseRec(s);
        s.push(x);
    }

    public static void displayRec(Stack<Integer> s){
        if(s.isEmpty()) return;
        int x = s.pop();
        displayRec(s);
        System.out.print(x+" ");
        s.push(x);
    }


    public static void removeFromIndex(Stack<Integer> b, int idx) {
        Stack<Integer> a = new Stack<>();
        // Move elements above the target index to temp stack
        while (b.size() > idx + 1) {
            a.push(b.pop());
        }
        // Remove the element at the index
        b.pop();

        // Push elements back to original stack
        while (!a.isEmpty()) {
            b.push(a.pop());
        }
    }



    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);


        removeFromIndex(st , 3);
        System.out.println(st);

//        System.out.println(st);

//        Stack<Integer> rt = new Stack<>();
//        while(st.size() > 0){
//          rt.push(st.pop());
//        }
//
//        while (rt.size() > 0){
//            int x = rt.pop();
//            System.out.print(x +  " ");
//            st.push(x);
//        }


//        int n = st.size();
//        int[] arr = new int[n];
//
//        for (int i = n-1; i >= 0; i--) {
//           arr[i] = st.pop();
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ");
//            st.push(arr[i]);
//        }

//        displayRec(st);




    }
}
