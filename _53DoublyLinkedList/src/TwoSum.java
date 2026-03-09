// Sorted list in non-decreasing order , target

public class TwoSum {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean targetSum(Node head , int target){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        Node h = head;
        Node t = temp;
        while (h != null && t != null && h != t && h.prev != t) {
            int sum = h.data + t.data;
            if (sum == target) return true;
            else if (sum > target) t = t.prev;
            else h = h.next;
        }

        return false;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(8);
        Node d = new Node(13);
        Node e = new Node(100);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;

        System.out.println(targetSum(a ,16));
    }
}
