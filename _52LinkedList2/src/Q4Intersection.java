// Intersection Point in Y Shaped Linked Lists

class Q4Intersection {

    public static class  Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    Node intersectPoint(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;

        int m = length(head1);
        int n = length(head2);

        if (m > n) {
            int step = m - n;
            for (int i = 1; i <= step; i++) {
                temp1 = temp1.next;
            }
        } else {
            int step = n - m;
            for (int i = 1; i <= step; i++) {
                temp2 = temp2.next;
            }
        }

        while (temp1 != null && temp2 != null) {
            if (temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }

    int length(Node head) {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args) {
        // Creating nodes
        Node common = new Node(15);
        common.next = new Node(30);

        // First Linked List: 10 -> 15 -> 30
        Node head1 = new Node(10);
        head1.next = common;

        // Second Linked List: 3 -> 6 -> 9 -> 15 -> 30
        Node head2 = new Node(3);
        head2.next = new Node(6);
        head2.next.next = new Node(9);
        head2.next.next.next = common;

        Q4Intersection sol = new Q4Intersection(); // ✅ fix here
        Node intersection = sol.intersectPoint(head1, head2);

        if (intersection != null) {
            System.out.println("Intersection at node with data: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }

}


