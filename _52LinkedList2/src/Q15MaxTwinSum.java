public class Q15MaxTwinSum {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }


    public static int maxTwinSum(Node head) {
        if (head == null) return 0;

        Node m = middle(head);
        Node afterMiddle = reverse(m.next);

        int max = Integer.MIN_VALUE;

        while (afterMiddle != null) {
            int value = head.data + afterMiddle.data;
            max = Math.max(max, value);
            head = head.next;
            afterMiddle = afterMiddle.next;
        }

        return max;
    }

    public static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;

        while (curr != null) {
            Node after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static Node middle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(10);
        Node c = new Node(13);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(2);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        h.next = null;

        System.out.println(maxTwinSum(a));
    }
}
