// Remove duplicates from a sorted linked list

public class Q12RemoveDuplicates {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node removeDuplicate(Node head){
        Node temp = head;

        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }

        return head;
    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(1);
        Node c = new Node(2);
        Node d = new Node(2);
        Node e = new Node(3);
        Node f = new Node(3);
        Node g = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next =f;
        f.next =g;


        Node head = removeDuplicate(a);
        display(head);

    }
}
