import java.util.LinkedList;
import java.util.Queue;

public class _3StackUsingQueue {

    public static class StackUQ{
        Queue<Integer> q = new LinkedList<>();


        public void push(int x){
            if (q.isEmpty()) q.add(x);
            else {
                q.add(x);
                for (int i = 1; i <=q.size() ; i++) {
                    q.add(q.remove());
                }
            }
        }

        public int pop(){
            return  q.remove();
        }

        public int peek(){
            return q.peek();
        }
        public boolean empty(){
            return q.isEmpty();
        }
        public void display(){
            System.out.println(q);
        }
    }

    public static void main(String[] args) {
        StackUQ st = new StackUQ();
        st.peek();
        st.push(2);
     }
}
