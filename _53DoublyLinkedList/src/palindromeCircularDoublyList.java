

public class palindromeCircularDoublyList {

    public static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public static boolean checkPalindrome(int x){

        int d = x;
        int rev = 0;
        while (d > 0) {
            int digit = d % 10;
            rev = rev * 10 + digit;
            d = d / 10;
        }

        return x == rev;
    }


    public static boolean checkPalindromeList(Node head){
        if (head == null) {
            return false;
        }
        if (!checkPalindrome(head.data)) {
            return false;
        }
       Node temp = head.next;
       while (temp != head){
          if(!checkPalindrome(temp.data)){
              return false;
          }
           temp = temp.next;
       }
       return true;
    }
    public static void main(String[] args) {
        Node a = new Node(11);
        Node b = new Node(121);
        Node c = new Node(22);
        Node d = new Node(44);
        Node e = new Node(55);

        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev =b;
        c.next =d;
        d.prev = c;
        d.next = e;
        e.prev =d;
        e.next = a;
        a.prev = e;

        if (checkPalindromeList(a)) {
            System.out.println("All node data are palindromes.");
        } else {
            System.out.println("Not all node data are palindromes.");
        }
    }
}
