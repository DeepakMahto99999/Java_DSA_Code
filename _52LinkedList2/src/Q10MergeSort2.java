// Merge sort 

public class Q10MergeSort2 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node mergeSort(Node head) {
        if (head == null || head.next == null) return head;

        Node middle = findMiddle(head);
        Node leftHead = head;
        Node rightHead = middle.next;
        middle.next = null;

        Node leftSorted = mergeSort(leftHead);
        Node rightSorted = mergeSort(rightHead);

        return merge(leftSorted, rightSorted);
    }

    // Find middle node (not the value)
    public static Node findMiddle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Merge two sorted linked lists
    public static Node merge(Node a, Node b) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            } else {
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        // Attach the remaining part
        tail.next = (a != null) ? a : b;

        return dummy.next;
    }

    // Utility function to print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(1);
        Node c = new Node(4);
        Node d = new Node(2);
        Node e = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node sortedHead = mergeSort(a);
        printList(sortedHead);
    }
}
