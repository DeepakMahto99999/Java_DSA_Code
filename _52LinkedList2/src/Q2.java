// Finding Nth Node from the end of Linked List

public class Q2 {

  public static   class  Node{
        int data;
        Node next;

        Node(int data){
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

    public static int NthNodeStart(Node head, int idx){
        Node temp = head;

        for(int i =1; i < idx; i++){
            temp = temp.next;
        }
       return temp.data;
    }

    public static int NthNodeEnd(Node head, int idx){
        Node temp = head;

        int n = Length(head);

        for(int i =1; i < n- idx+1; i++){
            temp = temp.next;
        }
        return temp.data;
    }

    public static Node NthNodeEnd2(Node head, int idx){
        Node temp = head;

        int n = Length(head);

        for(int i =1; i < n- idx+1; i++){
            temp = temp.next;
        }
        return temp;
    }

    // two pointer approach & turtle rabbit approach
    public static Node nthNode2(Node head , int n){
      Node slow = head;
      Node fast = head;

        for (int i = 1; i <=n ; i++) {
            fast = fast.next;
        }

        while (fast!= null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
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
        Node a = new  Node(100);
        Node b = new  Node(13);
        Node c = new  Node(4);
        Node d = new  Node(5);
        Node e = new  Node(12);
        Node f = new  Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        int len = NthNodeStart(a,3);
        System.out.println("Nth node from start: " +len);

        int len2 = NthNodeEnd(a,2);
        System.out.println("Nth node from end: " +len2);
        
        Node node = NthNodeEnd2(a, 2);
        System.out.println("Nth node from end by Node method: " +node.data); // Output: 40

        System.out.println(node.next.data); // Output: 50

      Node n =  nthNode2(a,6);
      System.out.println("Nth node from end by turtle rabbit approach: " +n.data);

    }
}
