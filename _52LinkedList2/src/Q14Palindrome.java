//

public class Q14Palindrome {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }

    }

    public static boolean checkPalindrome(Node head){
        if(head == null) return false;

        Node copy = deepCopy(head);
        Node reversed = reverse(copy);

        return isEqual(head ,reversed);
    }

    public static boolean checkPalindrome2(Node head){
        if(head == null) return false;

        Node m = middle(head);

        Node afterMiddle = reverse(m.next);

        while (afterMiddle != null){
            if(head.data != afterMiddle.data) return false;
            head = head.next;
            afterMiddle = afterMiddle.next;
        }
        return true;
    }

    public static boolean checkPalindrome3(Node head){
       Node slow = head;
       Node fast = head;

       while (fast.next != null && fast.next.next != null){
           slow = slow.next;
           fast = fast.next;
       }

       Node temp = reverse(slow.next);
       slow.next = temp;

       Node p1 = head;
       Node p2 = slow.next;

       while (p2 != null){
           if(p1.data != p2.data) return false;
           p1 = p1.next;
           p2 = p2.next;
       }
        return true;
    }

public static Node deepCopy(Node head){
        if(head == null) return null;

        Node newHead = new Node(head.data);
        Node curr = head.next;
        Node copyCurr = newHead;

        while (curr != null){
            copyCurr.next = new Node(curr.data);
            curr = curr.next;
            copyCurr = copyCurr.next;
        }
        return newHead;
}

public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;

        while (curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
}

public static boolean isEqual(Node a , Node b){
        Node temp = a;
        Node temp2 = b;
        while (temp != null && temp2 != null){
            if(temp.data != temp2.data){
                return false;
            }
            temp = temp.next;
            temp2 = temp2.next;
        }
        return temp == null && temp2 == null;
}

public static Node middle(Node head){
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
}

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);

        a.next =b;
        b.next =c;
        c.next =d;
        d.next =e;
        e.next = null;

        System.out.println(checkPalindrome(a));
        System.out.println(checkPalindrome2(a));
    }
}
