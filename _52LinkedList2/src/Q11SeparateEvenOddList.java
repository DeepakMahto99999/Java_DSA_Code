public class Q11SeparateEvenOddList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Method 1: Modify original list - even first, then odd
    public static Node splitOddEven(Node head) {
        Node temp = head;

        Node even = new Node(-1);  // dummy node
        Node odd = new Node(-2);   // dummy node

        Node evenTemp = even;
        Node oddTemp = odd;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                evenTemp.next = temp;
                evenTemp = evenTemp.next;
            } else {
                oddTemp.next = temp;
                oddTemp = oddTemp.next;
            }
            temp = temp.next;
        }

        oddTemp.next = null;            // break the last link
        evenTemp.next = odd.next;       // merge odd after even

        return even.next;
    }

    // Method 2: Create a new list - even first, then odd
    public static Node splitOddEven2(Node head) {
        Node temp = head;

        Node evenDummy = new Node(-1);
        Node oddDummy = new Node(-2);

        Node evenTemp = evenDummy;
        Node oddTemp = oddDummy;

        while (temp != null) {
            if (temp.data % 2 == 0) {
                evenTemp.next = new Node(temp.data);
                evenTemp = evenTemp.next;
            } else {
                oddTemp.next = new Node(temp.data);
                oddTemp = oddTemp.next;
            }
            temp = temp.next;
        }

        evenTemp.next = oddDummy.next;   // connect even to odd
        return evenDummy.next;           // head of the new list
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

        System.out.print("Original list: ");
        display(a);

        Node newHead1 = splitOddEven(a);
        System.out.print("After Method 1 (in-place): ");
        display(newHead1);

        System.out.print("After modify: ");
        display(a);


        // Re-create the original list for method 2
        Node x = new Node(5);
        Node y = new Node(1);
        Node z = new Node(4);
        Node p = new Node(2);
        Node q = new Node(3);

        x.next = y;
        y.next = z;
        z.next = p;
        p.next = q;

        Node newHead2 = splitOddEven2(x);
        System.out.print("After Method 2 (new list): ");
        display(newHead2);
    }
}
