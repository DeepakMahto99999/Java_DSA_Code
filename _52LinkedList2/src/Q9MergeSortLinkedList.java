// Merge 2 sorted Linked Lists - O(n) space

public class Q9MergeSortLinkedList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node mergeTwoLists(Node head1 , Node head2){
        Node temp1 = head1;
        Node temp2 = head2;

        Node head = new Node(-1);

        Node temp = head;

        while (temp1!=null && temp2 != null){
         if(temp1.data < temp2.data){
             temp.next = new Node(temp1.data);
             temp1 = temp1.next;
         }else {
             temp.next = new Node(temp2.data);
             temp2 = temp2.next;
         }
         temp = temp.next;
        }

        while (temp1 != null) {
            temp.next = new Node(temp1.data);
            temp1 = temp1.next;
            temp = temp.next;
        }

        while (temp2 != null) {
            temp.next = new Node(temp2.data);
            temp2 = temp2.next;
            temp = temp.next;
        }

        return head.next;
    }

    public static void main(String[] args) {
      Node a = new Node(1);
      Node b =new Node(3);
      Node c =new Node(5);
      Node d =new Node(8);
      Node e =new Node(9);

      a.next = b;
      b.next =c;
      c.next =d;
      d.next =e;

        Node w =new Node(4);
        Node x =new Node(6);
        Node y =new Node(7);
        Node z =new Node(12);

        w.next = x;
        x.next =y;
        y.next = z;


        Node merged = mergeTwoLists(a, w);
        printList(merged);
    }
}
