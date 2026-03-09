// // Merge 2 sorted Linked Lists - O(1) space


public class Q10MergeSort01Space {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node merge2SortedList(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        Node head = new Node(100); // dummy node
        Node temp = head;

        while(temp1 != null && temp2 != null){
            if(temp1.data < temp2.data){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }

        if (temp1 == null) {
            temp.next = temp2;
        } else {
            temp.next = temp1;
        }

        return head.next; // skipping dummy node
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(3);
        Node c = new Node(5);
        Node d = new Node(8);
        Node e = new Node(9);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        Node w = new Node(2);
        Node x = new Node(4);
        Node y = new Node(6);
        Node z = new Node(7);

        w.next = x;
        x.next = y;
        y.next = z;

        Node merged = merge2SortedList(a, w);
        printList(merged);
    }
}

