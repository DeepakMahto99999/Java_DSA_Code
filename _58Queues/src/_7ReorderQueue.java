// Reorder queue (Interval 1st half with 2nd half)

//  step1:- Move first half to stack
//  step2:- Empty stack to queue
//  step3:- Move 1st half again in stack
//  step4: one by one add st.peek() && q.peek() to queue
//  step5: revere the queue by the help of stack

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _7ReorderQueue {

    public static Queue<Integer> reorderQ(Queue<Integer> q){
        int s = q.size();
        int k = s/2;

        Queue<Integer> q1 = new LinkedList<>();

        for (int i = 0; i < k; i++) {
            q1.add(q.remove());
        }

        Queue<Integer> result = new LinkedList<>();

//        while (!q1.isEmpty() || !q.isEmpty()){
//            if (q1.size() == q.size()){
//                result.add(q1.remove());
//            }else if (q.size() > q.size()){
//                result.add(q.remove());
//            }
//            else {
//                result.add(q1.remove());
//            }
//        }

        while (!q1.isEmpty() || !q.isEmpty()) {
            if (!q1.isEmpty()) result.add(q1.remove());
            if (!q.isEmpty()) result.add(q.remove());
        }
        return result;
    }

    public static Queue<Integer> reorderQ2(Queue<Integer> q){
        Stack<Integer> st = new Stack<>();
        int s = q.size();
        int k = s/2;

        for (int i = 0; i < k ; i++) {
            st.push(q.remove());
        } // 5 6 7 8 --> q

        while (!st.isEmpty()){
            q.add(st.pop());
        } // 5 6 7 8 4 3 2 1 --> q

        for (int i = 0; i < k ; i++) {
            st.push(q.remove());
        } // 4 3 2 1 ---> q


        for (int i = 0; i < k ; i++) {
           // one by one, pehle stack se fir q se
            q.add(st.pop());
            q.add(q.remove());
        }
        // 8 4 7 3 6 2 5 1
        // reverse the queue

        while (!q.isEmpty()){
            st.push(q.remove());
        }

        while (!st.isEmpty()){
            q.add(st.pop());
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
        q.add(6);
        q.add(7);
        q.add(8);
        Queue<Integer> r =  reorderQ2(q);
        System.out.println(r);
    }
}
