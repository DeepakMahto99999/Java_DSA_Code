

public class doublyLL {

    public static class Node{
        int val;
        Node next;
        Node prev;

        Node (int val){
            this.val = val;
        }
    }

    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void displayReverse(Node tail){
        Node temp = tail;
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void displayRandom(Node random){
        Node temp = random;
        // Move this backwards to the head
        while (temp.prev != null){
            temp = temp.prev;
        }
        // now temp is at head
        // print the list
        while (temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }


    public static Node insertAtHead(Node head , int x){
        Node temp = new Node(x);
        if(head == null){
          return temp;
        } else{
            temp.next = head;
            head.prev = temp;
            return temp;
        }
    }

    public static Node insertAtTail(Node head , int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        } else {
            Node t = head;
            while(t.next != null){
                t = t.next;
            }
            t.next = temp;
            temp.prev = t;
            return head;
        }
    }

    public static void insertAt(Node head, int idx, int x) {
        Node s = head;
         for (int i = 1; i <=idx -1 ; i++) {
            s = s.next;
         }
         // s is at idx-1 position
           Node r = s.next;  // idx
           Node t = new Node(x);

           // s t r
         s.next = t;
         t.prev = s;
         t.next = r;
         r.prev = t;
    }

    public static void deleteAt(Node head , int idx ){
        if(idx == 0 ){
            head = head.next;
            head.prev = null;
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1 ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
    }


    public static int length(Node head){
        Node temp = head;
        int count = 0;

        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


    public static void main(String[] args) {
        // 4 10 2 99 13
        Node a = new Node(4);
        Node b = new Node(10);
        Node c = new Node(2);
        Node d = new Node(99);
        Node e = new Node(13);

        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next =c;
        c.prev = b;
        c.next = d;
        d.prev =c;
        d.next = e;
        e.prev = d;
        e.next = null;

//      display(a);
//      displayReverse(e);
        displayRandom(e);
        Node newHead = insertAtHead(a , 35);
        display(newHead);
        Node headl = insertAtTail(newHead , 30);
        display(headl);

       insertAt(newHead , 2 , 50);
        display(newHead);
   deleteAt(newHead , 2);
   display(newHead);
        }
}
