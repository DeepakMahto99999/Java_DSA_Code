
public class practice {

    static class Stack {
        int[] arr = new int[5];
        int idx = 0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx++] = x;
        }

        void display(){
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        boolean isFull(){
            return idx == arr.length;
        }


        boolean isEmpty(){
            if (idx == 0) return true;
            else return false;
        }

        void pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty");
                return;
            }
            idx--;
            arr[idx] = 0;
        }

        int size(){
            return idx;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx - 1];
        }



    }

    public static class Node{ // user defined data type
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    static class LLStack{
        private Node head = null;
        private  int size = 0;


        void push(int x){
           Node temp = new Node(x);
           temp.next = head;
           head = temp;
           size++;
        }

        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        int peek(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.val;
        }

        void displayRec(Node head) {
            if (head == null) return;
            displayRec(head.next);
            System.out.print(head.val + " ");
        }

        void display(){
            displayRec(head);
            System.out.println();
        }


        int size(){
            return size;
        }
        boolean isFull() {
            return false; // ✅ to avoid error in main
        }

    }

    public static void main(String[] args) {
       LLStack st = new LLStack();
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
        st.peek();
        System.out.println(st.isFull());
        st.push(100);
    }

}
