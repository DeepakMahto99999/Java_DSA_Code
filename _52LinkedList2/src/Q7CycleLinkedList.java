// Cycle in a linked list

import java.util.HashSet;
import java.util.Set;

public class Q7CycleLinkedList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head) {
        if (head == null) return;

        // Use a HashSet to detect cycles
        Set<Node> visited = new HashSet<>();
        Node temp = head;

        while (temp != null && !visited.contains(temp)) {
            System.out.print(temp.data + " ");
            visited.add(temp);
            temp = temp.next;
        }

        // If we stopped because of a cycle, indicate it
        if (temp != null) {
            System.out.print("(cycle detected at " + temp.data + ")");
        }

        System.out.println();
    }

    public static boolean cycleInLinkedList(Node head){
        Node slow = head;
        Node fast = head;

        if(head == null) return false;

        if(head.next == null) return false;

        while (fast != null){
            if(slow == null) return false;
            slow = slow.next;
            if(fast.next == null) return false;
            fast = fast.next.next;
            if(fast == slow ) return true;
        }
        return false;
    }


    public static void main(String[] args) {

        Node a = new Node(100);
        Node b = new Node(12);
        Node c = new Node(0);
        Node d = new Node(-4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = a;

        display(a);
        System.out.println(cycleInLinkedList(a));
    }
}
