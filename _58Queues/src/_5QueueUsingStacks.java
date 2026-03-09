// pop efficient

import java.util.Stack;

public class _5QueueUsingStacks {

    public static class queueStack{
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();

        public void push(int x){
          if (st1.empty()) st1.push(x);
          else {
              while(!st1.isEmpty()){
                  st2.push(st1.pop());
              }
              st1.push(x);
              while(!st2.isEmpty()){
                  st1.push(st2.pop());
              }
          }
        }

        public int pop(){
            int x = st1.pop();
            return x;
        }

        public int peek(){
            int x = st1.peek();
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
