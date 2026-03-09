import java.util.*;

public class CriticalPointDistance {

    public static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    public static int[] CriticalPointDistance(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }

        List<Integer> criticalPoints = new ArrayList<>();
        int index = 1;

        Node prev = head;
        Node curr = head.next;
        Node next = curr.next;

        while (next != null) {
            if ((curr.data > prev.data && curr.data > next.data) ||
                    (curr.data < prev.data && curr.data < next.data)) {
                criticalPoints.add(index);
            }
            prev = curr;
            curr = next;
            next = next.next;
            index++;
        }

        if (criticalPoints.size() < 2) {
            return new int[]{-1, -1};
        }

        int minDist = Integer.MAX_VALUE;
        for (int i = 1; i < criticalPoints.size(); i++) {
            minDist = Math.min(minDist, criticalPoints.get(i) - criticalPoints.get(i - 1));
        }

        int maxDist = criticalPoints.get(criticalPoints.size() - 1) - criticalPoints.get(0);

        return new int[]{minDist, maxDist};
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(1); // local minima
        Node d = new Node(2);
        Node e = new Node(5); // local maxima
        Node f = new Node(1); // local minima
        Node g = new Node(2);


        a.prev = null; a.next = b;
        b.prev = a;    b.next = c;
        c.prev = b;    c.next = d;
        d.prev = c;    d.next = e;
        e.prev = d;    e.next = f;
        f.prev = e;    f.next = g;
        g.prev = f;   g.next = null;

        int[] result = CriticalPointDistance(a);
        System.out.println("Min distance between critical points: " + result[0]);
        System.out.println("Max distance between critical points: " + result[1]);
    }
}
