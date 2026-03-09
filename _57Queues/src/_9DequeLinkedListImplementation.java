public class _9DequeLinkedListImplementation {

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
    }

    public static class dequeLL{
        int size = 0;
        Node head = null; // front
        Node tail = null; // rear

        // Add at rear
        public void addLast(int x){
            Node temp = new Node(x);
            if (size ==0){
                 head = tail = temp;
            }else {
                tail.next = temp;
                temp.prev = tail;
                tail = temp;
            }
            size++;
        }

        // Add at front
        public void addFirst(int x){
           Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
            }else {
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }

        // remove from rear
        public int removeLast(){
            if (size == 0){
                System.out.println("Deque is Empty");
                return -1;
            }
            int x = tail.val;
            if (size == 1){
                head = tail = null;
            }else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
            return x;
        }

        // remove from front
        public int removeFirst(){
            if (size == 0){
                System.out.println("Deque is Empty");
                return -1;
            }
            int x = head.val;
            if (size == 1){
                head = tail = null;
            }else{
                head = head.next;
                head.prev = null;
            }
            size--;
            return x;
        }

        public int peekFirst() {
            if (size == 0) {
                System.out.println("Deque is Empty");
                return -1;
            }
            return head.val;
        }

        public int peekLast() {
            if (size == 0) {
                System.out.println("Deque is Empty");
                return -1;
            }
            return tail.val;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Deque is Empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        dequeLL dq = new dequeLL();
        dq.addLast(10);
        dq.addFirst(5);
        dq.addLast(20);
        dq.display();             // 5 10 20
        System.out.println(dq.removeFirst()); // 5
        System.out.println(dq.removeLast());  // 20
        dq.display();
    }
}
