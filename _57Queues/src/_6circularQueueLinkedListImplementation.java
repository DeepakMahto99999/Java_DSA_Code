public class _6circularQueueLinkedListImplementation {

    public static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    public static class queueLL {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void add(int x) {
            Node temp = new Node(x);
            if (size == 0) {
                head = tail = temp;
                tail.next = head;  // make circular
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head;  // maintain circular link
            }
            size++;
        }

        public int peek() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }

        public int remove() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int x = head.val;
            if (size == 1) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;  // update circular link
            }
            size--;
            return x;
        }

        public void display() {
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }

            Node temp = head;
            do {
                System.out.print(temp.val + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }

        public boolean isEmpty() {
            return size == 0;
        }
    }

    public static void main(String[] args) {
        queueLL q = new queueLL();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display(); // Output: 10 20 30
        System.out.println("Removed: " + q.remove()); // 10
        q.display(); // 20 30
        System.out.println("Peek: " + q.peek()); // 20
    }
}
