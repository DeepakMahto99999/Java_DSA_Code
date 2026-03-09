

public class Q13ReverseLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static void displayReverse(Node head) {
        if(head == null) return; // base case
        displayReverse(head.next); // call
        System.out.print(head.data+ " "); // work
    }

    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void reverseList(Node head){
        if(head == null) return;
        reverseList(head.next);
        System.out.print(head.data+" ");
    }


  // recursive approach
  public static Node reverse(Node head){
      if(head.next == null) return head;
      Node newHead = reverse(head.next);
      head.next.next = head;
      head.next = null;
      return newHead;
  }

  public static Node reverseIterative(Node head){
        Node curr = head;
        Node before = null;
        Node after = null;
        while(curr !=null){
            after = curr.next;
            curr.next = before;
            before = curr;
            curr = after;
        }
         return before;
    }


    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(5);
        Node c = new Node(1);
        Node d = new Node(2);
        Node e = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

      //  reverseList(a);

    Node r = reverse(a);
    display(r);

    Node i = reverseIterative(r);
    display(i);

    }
}
