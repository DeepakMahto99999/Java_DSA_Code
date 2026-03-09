//  Flatten a multilevel doubly linked list
public class FlattenMultilevel {


    public static class Node{
        int val;
        Node prev;
        Node next;
        Node child;

        Node(int val){
            this.val = val;
        }
    }


    public static Node flatten(Node head){
            Node temp = head;
            while(temp != null){
                Node t = temp.next;
                if(temp.child != null){
                    Node c = flatten(temp.child);
                    temp.next = c;
                    c.prev = temp;
                    // c ko aage le jao
                    while (c.next != null){
                       c = c.next;
                    }
                    c.next = t;
                  if(t!=null)  t.prev = c;
                }
                temp.child = null; // vvi
                temp = t;
            }
            return head;
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        Node g = new Node(7);
        Node h = new Node(8);
        Node i = new Node(9);
        Node j = new Node(10);

        Node k = new Node(11);
        Node l = new Node(12);

        // Main level
        a.prev = null; a.next = b;
        b.prev = a; b.next = c;
        c.prev = b; c.next = d; c.child = g;
        d.prev = c; d.next = e;
        e.prev = d; e.next = f;
        f.prev = e; f.next = null;

        // Child of 3
        g.prev = null; g.next = h;
        h.prev = g; h.next = i; h.child = k;
        i.prev = h; i.next = j;
        j.prev = i; j.next = null;

        // Child of 8
        k.prev = null; k.next = l;
        l.prev = k; l.next = null;

        // Call flatten
        Node head = flatten(a);

        // Print flattened list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

}
