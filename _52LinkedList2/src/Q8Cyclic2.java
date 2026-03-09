// find out the node where the cycle begins i.e that node at which
// the tail node points.

// cycle Detection + Number of nodes in cycle + cycle Detection + Interesting
// observation


public class Q8Cyclic2 {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node startingCyclePoint(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) break;
        }

        if (fast == null || fast.next == null) return null; // No cycle

        Node temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }

        return slow;
    }

    public static Node EndingCyclePoint(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow) break;
        }

        if (fast == null || fast.next == null) return null; // No cycle

        Node temp = head;
        Node prev = null;
        while (temp != slow) {
            temp = temp.next;
            prev = slow;
            slow = slow.next;
        }

        return prev;
    }

    public static int cycleLength(Node head) {
        Node start = startingCyclePoint(head);
        if (start == null) return 0; // No cycle

        int length = 1;
        Node temp = start.next;

        while (temp != start) {
            length++;
            temp = temp.next;
        }

        return length;
    }

    public static int totalLength(Node head){
        Node cycleStart = startingCyclePoint(head);
        if(cycleStart == null){
            int count =0;
            Node temp = head;
            while(temp != null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        int countBeforeCycle = 0;
        Node temp = head;
        while (temp != cycleStart){
            countBeforeCycle++;
            temp = temp.next;
        }

        int cycleLen = cycleLength(head);
        return countBeforeCycle + cycleLen;
    }


    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(2);
        Node c = new Node(0);
        Node d = new Node(-4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;  // cycle starts at node with data = 2
        e.next =f;
        f.next = c;


        Node cycleStart = startingCyclePoint(a);
        System.out.println("Cycle starts at node with data: " + (cycleStart != null ? cycleStart.data : "No cycle"));
        Node t = EndingCyclePoint(a);
        System.out.println(t.data);

        int len = cycleLength(a);
        System.out.println("Cycle length is: " + len);

        System.out.println("Total node count (including cycle): " + totalLength(a));

    }
}
