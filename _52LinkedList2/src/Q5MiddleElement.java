// Finding middle element of a linked list

public class Q5MiddleElement {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }


    public static int middleElement(Node head){
        int n = length(head);

        int ans = -1;

        Node temp = head;

        if(n % 2 == 0){
        int mid = n /2;
        for (int i = 1; i < mid  ; i++) {
            temp = temp.next;
        }
        } else {
            int mid = n/2+1;
            for (int i = 1; i < mid  ; i++) {
                temp = temp.next;
            }
        }

        ans = temp.data;

        return ans;
    }

    public static int middleElement2(Node head){
        Node slow = head;
        Node fast = head;

        int n = length(head);

        int ans = -1;

        int mid = n/2;

//        while(fast.next !=null && fast.next.next != null){
//            slow = slow.next;
//            fast = fast.next.next;
//        }

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

       return slow.data;
    }

  public static   int length(Node head){
        int count =0;
        Node temp = head;
        while(temp !=null){
            count++;
            temp =temp.next;
        }

        return count;
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

        System.out.println(middleElement(a));
        System.out.println(middleElement2(a));

    }

}
