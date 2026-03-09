import java.util.*;

public class _2PrintQueue {

    public static void displayQueue(Queue<Integer> q){
        if (q.isEmpty()) return;
        int x = q.poll();
        System.out.print(x + " ");
        displayQueue(q);
        q.add(x);
    }

    public static void displayQueue2(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        while (!q.isEmpty()){
            st.push(q.poll());
        }
        while(!st.isEmpty()){
            int x = st.pop();
            System.out.print(x + " ");
            q.add(x);
        }

    }

    public static void displayQueue3(Queue<Integer> q){
        Queue<Integer> q2 = new LinkedList<>();
        while(!q.isEmpty()){
            int x = q.poll();
            System.out.print(x+" ");
        }

        while(!q2.isEmpty()){
            q.add(q2.poll());
        }

    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // rear -> 5 4 3 2 1 -> front
        System.out.println(q);
        displayQueue(q);
        System.out.println();
        displayQueue2(q);
        System.out.println();
        displayQueue3(q);
    }
}
