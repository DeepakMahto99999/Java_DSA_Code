
public class Main {

    public static class Node {
        int data; // value
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    // Display linked list (iterative)
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // Display recursively
    public static void displayr(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayr(head.next);
    }

    // Display reverse recursively
    public static void displayReverse(Node head) {
        if (head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }

    // Length (iterative)
    public static int length(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Length (recursive)
    public static int lengthRecursion(Node head) {
        if (head == null) return 0;
        return 1 + lengthRecursion(head.next);
    }

    // Insert at start (returns new head)
    public static Node insertAtStart(Node head, int val) {
        Node temp = new Node(val);
        if(head == null){
            return temp;
        }
        temp.next = head;
        return temp;
    }


    // Insert at end (returns new head)
    public static Node insertAtEnd(Node head, int val) {
        Node temp = new Node(val);

        if (head == null) {
            return temp; // List was empty, new node becomes head
        }

        Node t = head;
        while (t.next != null) {
            t = t.next;
        }
        t.next = temp;
        return head;
    }


    // Insert at given index
    public static Node insertAt(Node head, int idx, int val) {
        if (idx < 0 || idx > length(head)) {
            System.out.println("Invalid index");
            return head;
        }

        if (idx == 0) {
            return insertAtStart(head, val);
        }

        if(idx == length(head)){
            return insertAtEnd(head,val);
        }

        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    // Delete at index
    public static Node deleteAt(Node head, int idx) {
        if (head == null || idx < 0 || idx >= length(head)) {
            System.out.println("Invalid index");
            return head;
        }

        if (idx == 0) {
            return head.next;
        }

        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        return head;
    }

    // Get value at index
    public static int getAt(Node head, int idx) {
        if (idx < 0 || idx >= length(head)) {
            System.out.println("Invalid index");
            return -1;
        }

        Node temp = head;
        for (int i = 0; i < idx; i++) {
            temp = temp.next;
        }
        return temp.data;
    }




    public static void main(String[] args) {
        Node a = new Node(5);  // head node
        Node b = new Node(3);
        Node c = new Node(9);

        a.next = b;
        b.next = c;

        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        displayReverse(a);
        System.out.println();

        System.out.println("Length (iterative): " + length(a));
        System.out.println("Length (recursive): " + lengthRecursion(a));

        a = deleteAt(a, 2);
        System.out.print("After deleting at index 2: ");
        display(a);
        System.out.println();

        a = deleteAt(a, 1);
        System.out.print("After deleting at index 1: ");
        display(a);
        System.out.println();

        a = deleteAt(a, 0);
        System.out.print("After deleting at index 0: ");
        display(a);
        System.out.println();

        a = insertAtEnd(a, 87);
        System.out.print("After inserting at end: ");
        display(a);
        System.out.println();

        System.out.println("After insertAtEnd on empty list:");
        System.out.println("Head data: " + a.data);

        Node tail = a;
        while (tail.next != null) {
            tail = tail.next;
        }
        System.out.println("Tail data: " + tail.data);

        a = deleteAt(a, 0);
        System.out.print("After deleting last node: ");
        display(a);
        System.out.println();

        a = insertAtStart(a, 100);
        System.out.print("After inserting at start: ");
        display(a);
        System.out.println();

        // Since it's the only node, head and tail both point to this node
        System.out.println("After insertion into empty list:");
        System.out.println("Head data: " + a.data);

        // Find tail
        tail = a;
        while (tail.next != null) {
            tail = tail.next;
        }
        System.out.println("Tail data: " + tail.data);

        a = insertAt(a, 1, 77);
        System.out.print("After inserting 77 at index 1: ");
        display(a);
        System.out.println();

        System.out.println("Value at index 1: " + getAt(a, 1));
    }

}
