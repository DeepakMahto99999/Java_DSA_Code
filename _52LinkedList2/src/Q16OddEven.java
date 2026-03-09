// Odd Even LinkedList do odd indices node should be together

public class Q16OddEven {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

public static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    System.out.println();
}

    public static Node oddIndices(Node head){
      Node odd = new Node(0);
      Node even = new Node(1);
      Node tempo = odd;
      Node tempe = even;
      Node temp = head;

      while (temp != null){
          tempo.next = temp;
          temp = temp.next;
          tempo = tempo.next;

          tempe.next = temp;
          if(temp == null) break;
          temp = temp.next;
          tempe = tempe.next;
      }
      odd = odd.next;
      even = even.next;
      tempo.next = even;
      return odd;
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
        f.next = null;

        Node t = oddIndices(a);
        printList(t);
    }
}


