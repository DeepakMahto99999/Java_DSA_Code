// copy list with Random Pointer: Construct a deep copy of a linked
// list where each node contains an additional random pointer , which
// could point to any node in the list or null.


// step1 :- Deep copy
// step2 :- Alternate connection
// step3 :- Assigning Random Pointers
// step4 :- Separating the lists




public class Q17RandomPointer {

    public static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
        }
    }

    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            int rand = (temp.random != null) ? temp.random.data : -1;
            System.out.println("Data: " + temp.data + ", Random: " + rand);
            temp = temp.next;
        }
    }

    public Node copyRandomList(Node head){

        Node head2 = new Node(0);
        Node temp2 = head2;
        Node temp1 = head;
        // creating deep copy - 7 13 11 10 1
        while (temp1 != null){
            Node t = new Node(temp1.data);
            temp2.next = t;
            temp2 = t;
            temp1 = temp1.next;
        }
        head2 = head2.next;
        temp2 = head2;
        temp1 = head;


        // Alternative connection
        Node temp = new Node(-1);
        while (temp1 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;

            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;

        }

        temp2 = head2;
        temp1 = head;

        // assigning random pointers
        while (temp1 != null && temp2 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp2.next;
          if(temp1 != null)  temp2 = temp1 .next;
        }
        temp2 = head2;
        temp1 = head;

        // separating the list
        while(temp1 != null){
            temp1.next = temp2.next;
            temp1 = temp1.next;
            if(temp1.next == null) break;
            temp2.next = temp1.next;
            if(temp.next == null) break;
            temp2 = temp2.next;
        }
   return head2;

    }


    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(11);
        Node c = new Node(1);
        Node d = new Node(4);
        Node e = new Node(6);
        Node f = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        // Setup random pointers
        a.random = d;
        b.random = a;
        c.random = f;
        d.random = null;
        e.random = b;
        f.random = c;

        Q17RandomPointer obj = new Q17RandomPointer();
        Node copied = obj.copyRandomList(a);

        System.out.println("Original List:");
        printList(a);

        System.out.println("\nCopied List:");
        printList(copied);
    }
}
