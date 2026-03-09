// Can we delete a node given the node itself as parameter?

// is there any efficient way , provided that the given node is not the
// last node



public  class Q1 {


    public static class Node {
        int data; // value
        Node next; // address of next node

        Node(int data) {
            this.data = data;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }


    public static Node deleteAt(Node head, int idx) {
        if (head == null) return null;
        if (idx == 1) {
            return head.next;
        }
        Node temp = head;
        for (int i = 1; i < idx - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }

    // not working in the case of tail
    public static Node deleteByNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
        return node;
    }

     public static int Length(Node head){
        int count =0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            count++;
        }
        return count;
     }


    public static void main(String[] args) {
//        linkedList l = new linkedList();

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);

        a.next = b;
        b.next = c;
        c.next = d;
        display(a);
        deleteAt(a , 2);
        display(a);
    }
}
