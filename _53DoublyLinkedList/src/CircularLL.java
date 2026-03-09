public class CircularLL {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        if (head == null) return;
        System.out.print(head.data + " ");
        Node temp = head.next;
        while (temp != head){
            System.out.print(temp.data+ " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node display2(Node a){
        if (a == null) return a;
        System.out.print(a.data + " ");
        Node temp = a.next;
        while (temp != a){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return a;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

         a.next = b;
         b.next =c;
         c.next =d;
         d.next = e;
         e.next = a;
         display(a);
         display2(c);
    }
}