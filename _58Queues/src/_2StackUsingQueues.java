import java.util.LinkedList;
import java.util.Queue;

public class _2StackUsingQueues {


    public static class stackQ{
    Queue<Integer> q = new LinkedList<>();

        public void push(int x){
            q.add(x);
        }

        public int pop(){
            for (int i = 1; i <=q.size()-1 ; i++) {
                q.add(q.remove());
            }
            // 4 1 2 3
            int val = q.remove();
            return val;
        }

         // 1 2 3 4
        public int top(){
            for (int i = 1; i <=q.size()-1 ; i++) {
                q.add(q.remove());
            }
            // 4 1 2 3
            int val = q.peek(); // 4
            q.add(q.remove());
            return val;
        }

        public boolean empty() {
            return q.isEmpty();
        }
        public void display(){
            System.out.println(q);
        }
    }

    public static void main(String[] args) {
     stackQ q = new stackQ();
     q.push(1);
     q.display();
    }
}
