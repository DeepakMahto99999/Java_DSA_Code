import java.util.ArrayList;

public class Q10MergeSort {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void Merge(Node head) {
        ArrayList<Integer> a = new ArrayList<>();
        Node temp = head;

        // Copy linked list to ArrayList
        while (temp != null) {
            a.add(temp.data);
            temp = temp.next;
        }

        // Sort the ArrayList
        MergeSort(a, 0, a.size() - 1);

        // Copy back the sorted values into the linked list
        temp = head;
        int idx = 0;
        while (temp != null) {
            temp.data = a.get(idx++);
            temp = temp.next;
        }
    }

    public static void MergeSort(ArrayList<Integer> a, int low, int high) {
        if (low >= high) return;
        int mid = low + (high - low) / 2;

        MergeSort(a, low, mid);
        MergeSort(a, mid + 1, high);
        merge(a, low, mid, high);
    }

    public static void merge(ArrayList<Integer> a, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            left.add(a.get(low + i));
        }
        for (int j = 0; j < n2; j++) {
            right.add(a.get(mid + 1 + j));
        }

        int i = 0, j = 0, k = low;

        while (i < n1 && j < n2) {
            if (left.get(i) < right.get(j)) {
                a.set(k++, left.get(i++));
            } else {
                a.set(k++, right.get(j++));
            }
        }

        while (i < n1) {
            a.set(k++, left.get(i++));
        }

        while (j < n2) {
            a.set(k++, right.get(j++));
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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

        System.out.print("Before sorting: ");
        printList(a);

        Merge(a);

        System.out.print("After sorting: ");
        printList(a);
    }
}
