import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _1reverseAQueue {

    public static Queue<Integer> reverseQ(Queue<Integer> q ){
        Stack<Integer> st = new Stack<>();

        while(!q.isEmpty()){
            st.push(q.remove());
        }

        while (!st.isEmpty()){
            q.add(st.pop());
        }

        return q;
    }

    public static Queue<Integer> reverseFirstK(Queue<Integer> q ,int k){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k ; i++) {
            st.push(q.remove());
        }

       Queue<Integer> q2 = new LinkedList<>();
        while (!q.isEmpty()) q2.add(q.remove());

        while (!st.isEmpty()) q.add(st.pop());

        while (!q2.isEmpty()) q.add(q2.remove());

        return q;
    }

    public static Queue<Integer> reverseFirstKElement(Queue<Integer> q ,int k){
        int n = q.size();
        if (k > n || k < 0) return q;

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < k ; i++) {
            st.push(q.remove());
        }

        while (!st.isEmpty()){
            q.add(st.pop());
        }

        for (int i = 0; i < n-k; i++) {
            q.add(q.remove());
        }

        return q;
    }

    public static void main(String[] args) {
     Queue<Integer> q = new LinkedList<>();
     q.add(1);
     q.add(2);
     q.add(3);
     q.add(4);
     q.add(5);

//     reverseQ(q);
        reverseFirstKElement(q,3);
     System.out.println(q);
    }
}
