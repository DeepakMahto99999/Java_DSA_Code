public class DoubleLinkedList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static class doublyLinkedList {
        Node head = null;
        Node tail = null;

        // Insert a node at the end
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            } else{
                tail.next = temp;
                temp.prev = tail;
            }
            tail = temp;
        }

        // Insert a node at the head
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            } else{
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
        }

        // Insert a node at a specific index
        void insertAt(int idx, int val) {
            if (idx < 0 || idx > size()) {
                System.out.println("Wrong index");
                return;
            }

            if (idx == size()) {
                insertAtEnd(val);
                return;
            } else if (idx == 0) {
                insertAtHead(val);
                return;
            }

            Node t = new Node(val);
            Node temp = head;
            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = t;
            }
            temp.next = t;
            t.prev = temp;
        }

        // Get the value at a specific index
        int getAt(int idx) {
            if (idx < 0 || idx >= size()) {
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for (int i = 0; i < idx; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // Display the list
        void display(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        // Delete a node at a specific index
        void deleteAt(int idx){
            if (idx < 0 || idx >= size()) {
                System.out.println("Wrong index");
                return;
            }

            Node temp = head;
            if (idx == 0) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
                return;
            }

            for (int i = 0; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;

            if (temp.next != null) {
                temp.next.prev = temp;
            } else {
                tail = temp;
            }
        }

        // Calculate the size of the list
        int size(){
            int count = 0;
            Node temp = head;
            while (temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        doublyLinkedList ll = new doublyLinkedList();

        System.out.println("Inserting at End:");
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.display(); // Output: 10 20 30

        System.out.println("\nInserting at Head:");
        ll.insertAtHead(5);
        ll.insertAtHead(2);
        ll.display(); // Output: 2 5 10 20 30

        System.out.println("\nInserting at Specific Index:");
        ll.insertAt(2, 7); // Insert 7 at index 2
        ll.display(); // Output: 2 5 7 10 20 30

        System.out.println("\nGet Value at Index:");
        System.out.println("Element at index 3: " + ll.getAt(3)); // Output: 10

        System.out.println("\nDeleting at Specific Index:");
        ll.deleteAt(2); // Delete node at index 2 (which is 7)
        ll.display(); // Output: 2 5 10 20 30

        System.out.println("\nDeleting head:");
        ll.deleteAt(0); // Delete head (2)
        ll.display(); // Output: 5 10 20 30

        System.out.println("\nDeleting last element:");
        ll.deleteAt(ll.size() - 1); // Delete last element (30)
        ll.display(); // Output: 5 10 20

        System.out.println("\nFinal Size of List: " + ll.size()); // Output: 3
    }
}
