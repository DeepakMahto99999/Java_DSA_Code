// Deleting the middle element of the linked list


public class Q6DeleteMiddleElement {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void display(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void deleteMiddle(Node head){
        Node slow = head;
        Node fast = head;
        Node prev = null;

        if (head == null || head.next == null) return;



//        while(fast !=null && fast.next != null){
//            prev = slow;
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        prev.next = slow.next;

        while (fast.next.next != null && fast.next.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next =slow.next.next;
    }


    public static void main(String[] args) {
       Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);

        a.next =b;
        b.next = c;
        c.next = d;
        d.next =e;
        e.next =f;

        display(a);
        deleteMiddle(a);
        display(a);
    }

}
