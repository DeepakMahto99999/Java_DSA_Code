package LinkedList;

public class basicsll {

     public static void insertAtEnd(Node head , int val){
           Node temp = new Node(val);
           Node t = head;
           while(t.next !=null){
               t = t.next;
           }
           t.next = temp;
     }

    // print linked list in reverse order by recursive
    public static void displayReverse(Node head){
        if(head==null) return;
        displayReverse(head.next);
        System.out.print(head.data+" ");
    }

    // print linkedList by recursion
    public static void displayr(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayr(head.next);
    }

    // print linkedList
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }

    // length of linkedList
    public static int length(Node head){
        Node temp = head;
        int count =0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    // length of linkedList by recursion
    public static int lengthRecursion(Node head){
        if(head == null) return 0;
        return 1 + lengthRecursion(head.next);
    }

    public static class  Node{
        int data; // value
        Node next; // address of next node

        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);  // head node
//        System.out.println(a.next); // null
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        // 5  3  9  8  16
        a.next = b;  // 5 -> 3  9  8  16
        b.next = c;  // 5 -> 3 -> 9  8  16
        c.next = d;  // 5 -> 3 -> 9 -> 8  16
        d.next = e;  // 5 -> 3 -> 9 -> 8 -> 16

//        System.out.println(a.data);
//        System.out.println(b.data);
//        System.out.println(c.data);
//        System.out.println(d.data);
//        System.out.println(e.data);
//
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//        System.out.println(a.next.next.next.next.data);

//        Node temp = a;
//        for (int i = 0; i < 5 ; i++) {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }

//        Node temp = a;
//        while (temp !=null){ // printing the list
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }


        display(a);
        System.out.println();
        displayr(a);
        System.out.println();
        displayReverse(a);
        System.out.println();
        System.out.println("Length of LinkedList is: " +length(a));
        System.out.println("Length of LinkedList is: " +lengthRecursion(a));
        insertAtEnd(a,87);
        display(a);
    }
}
