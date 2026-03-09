
public class practice {

    public static class queue{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];

        public void add(int val){
         if (size == arr.length){
             System.out.println("Queue is full");
             return;
         }else if(f == -1){
             r = f = 0;
             arr[0] = val;
         }else{
             arr[++r] = val;
         }
          size++;
        }

        public int remove(){
            if (f == -1){
                System.out.println("Queue is Empty");
                return -1;
            }else{
                f++;
                size--;
                return arr[f-1];
            }
        }

        public int peek(){
            return arr[f];
        }

        public boolean isEmpty(){
            if (size == 0) return true;
            else return false;
        }

        public void display(){
            if (size == 0) {
                System.out.println("Queue is empty");
            }else{
              for (int i = f; i <=r ; i++) {
                System.out.print(arr[i] + " ");
              }
            }
            System.out.println();
        }
    }


    public static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }

    public static class queueLL{
        Node head = null;
        Node tail = null;
        int size =0;

        public void add(int x){
            Node temp = new Node(x);
            if (size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        public int peek(){
            if (size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }

        public int remove(){
            if (size == 0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }

        public void display(){
            if (size == 0){
                System.out.println("Queue is Empty");
            }
            Node temp = head;
            while (temp != null){
                System.out.print(temp.val + " ");
                temp =temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if (size == 0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
//     queue q = new queue();
//     q.display();
//     q.add(1);
//     q.add(2);
//     q.add(3);
//     q.add(4);
//     q.add(5);
//     q.display();
//     q.remove();
//     q.display();
//     System.out.println(q.peek());

        queueLL q1 = new queueLL();
        q1.display();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.display();
        q1.remove();
        q1.display();
        System.out.println(q1.peek());
    }
}
