package LinkedList;

public class Q1 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }

    }


    public static class linkedList {
        Node head = null;
        Node tail = null;

         // Display linked list
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }



        int length(Node head) {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAtStart(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
        }

        void insertAt(int idx, int val) {
            if (idx < 0 || idx > length(head)) {
                System.out.println("Invalid input");
                return;
            }

            if (idx == 0) {
                insertAtStart(val);
                return;
            }

            if (idx == length(head)) {
                insertAtEnd(val);
                return;
            }

            Node temp = new Node(val);
            Node current = head;

            for (int i = 0; i < idx - 1; i++) {
                current = current.next;
            }

            temp.next = current.next;
            current.next = temp;
        }


        // Delete at index
        void deleteAt(int idx) {
            if (idx < 0 || idx >= length(head)) {
                System.out.println("Invalid input");
                return;
            }

            if (idx == 0) {
                head = head.next;
                if (head == null) {
                    tail = null; // List became empty
                }
                return;
            }

            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }

            temp.next = temp.next.next;

            // If deleted node was the tail
            if (temp.next == null) {
                tail = temp;
            }
        }

        int getAt(int idx) {
            if (idx < 0 || idx >= length(head)) {
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }
    }

    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.insertAtEnd(4);  // 4
        l.display();
        l.insertAtEnd(5);  // 4 -> 5
        l.display();
        l.insertAtEnd(6);  // 4 -> 5 -> 6
        l.display();
        l.insertAtStart(1); // 1 -> 4 -> 5 -> 6
        l.display();
        l.insertAt(4, 10); // 1 -> 4 -> 5 -> 6 -> 10
        l.display();
        System.out.println("Tail: " + l.tail.data); // Should be 10
        l.insertAt(0, 100); // 100 -> 1 -> ...
        l.display();
        l.deleteAt(5);  // Deleting 10 (tail)
        l.display();
        System.out.println("Tail after deletion: " + l.tail.data); // Should be 6
    }
}
