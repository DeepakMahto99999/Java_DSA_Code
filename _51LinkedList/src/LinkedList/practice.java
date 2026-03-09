package LinkedList;

public class practice {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static int getCount(Node head) {
        // code here
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void display(Node head){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.next = b;
        b.next = c;

        System.out.println(getCount(a));

        display(a);
    }
}
