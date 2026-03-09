import java.util.Stack;

public class _4QueueUsingStacks {

    public static class queueStack{
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public void push(int x){
            st1.push(x);
        }

        public int pop(){
            while (st1.size() > 1){
                st2.push(st1.pop());
            }
           int x =  st1.pop();
            while (!st2.isEmpty()){
                st1.push(st2.pop());
            }
            return x;
        }

        public int peek(){
            while (st1.size() > 1){
                st2.push(st1.pop());
            }
            int x =  st1.peek();
            while (!st2.isEmpty()){
                st1.push(st2.pop());
            }
            return x;
        }

        public boolean empty(){
            return  (st1.isEmpty());
        }
    }

    public static void main(String[] args) {
        queueStack q = new queueStack();
        q.push(1);
        q.push(2);
        q.push(3);
        System.out.println(q.peek());  // 1
        System.out.println(q.pop());   // 1
        System.out.println(q.empty()); // false
    }
}
