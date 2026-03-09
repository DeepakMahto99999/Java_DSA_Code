public class palindromeDoublyList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean checkPalindrome(Node head) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        Node t = temp;
        Node h = head;

        while (h != t && h.prev != t) {
            if (h.data != t.data) return false;
            h = h.next;
            t = t.prev;
        }
        return true;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        System.out.println(checkPalindrome(a)); // Output: true
    }
}
