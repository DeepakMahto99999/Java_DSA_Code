public class practice4 {

    public static class Node{
        int val;
        Node next;

       Node(int val){
           this.val = val;
       }
    }

    public static class Stack{
        Node head = null;
        int size = 0;

       void push(int x){
           Node temp = new Node(x);
           temp.next = head;
          head = temp;
           size++;
       }

       int pop(){
           if(head == null){
               System.out.print("Stack is Empty!");
               return -1;
           }
           int x = head.val;
           head = head.next;
           size--;
           return x;

       }

       int peek(){
           if(head == null){
               System.out.print("Stack is Empty!");
               return -1;
           }
           return head.val;
       }

        void displayReverse(Node head) {
            if (head == null) return;
            displayReverse(head.next);
            System.out.print(head.val + " ");
        }

        void display(){
           displayReverse(head);
            System.out.println();
        }

        boolean isEmpty() {
            return size == 0;
        }

        int size() {
            return size;
        }

        boolean isFull() {
            return false; // No max size limit; always return false
        }

    }


    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.display(); // 4
        st.push(5);
        st.display(); // 4 5
        st.push(1);
        st.display();  // 4 5 1
        System.out.println(st.size()); // 3
        st.pop();
        st.display(); // 4 5
        System.out.println(st.size()); // 2
        st.push(7);
        st.push(0);
        st.push(8);
        System.out.println(st.isFull());
        st.push(100);
    }
}
