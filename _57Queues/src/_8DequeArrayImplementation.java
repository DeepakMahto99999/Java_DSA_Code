public class _8DequeArrayImplementation {

    public static class deque{
        int f = -1;
        int r = -1;
        int size = 0;

        int[] arr = new int[5];

        public void addLast(int x){
            if (size == 0){
                f = r = 0;
                arr[0] = x;
            }else if (r == arr.length -1){
                System.out.println("Deque is Full at rear");
            }else{
                arr[++r] = x;
            }
            size++;
        }

        public int removeLast(){
            if (size == 0){
                System.out.println("Deque is Empty");
                return -1;
            }
            int x = arr[r--];
            size--;
            return x;
        }

        public int peekLast(){
            if (size == 0){
                System.out.println("Deque is Empty");
                return -1;
            }
            return arr[r];
        }

        public void addFirst(int x) {
            if (size == 0) {
                f = r = 0;
                arr[0] = x;
            } else if (f == 0) {
                System.out.println("No space at front");
                return;
            } else {
                arr[--f] = x;
            }
            size++;
        }

        public int removeFirst() {
            if (size == 0) {
                System.out.println("Deque is Empty");
                return -1;
            }
            int x = arr[f++];
            size--;
            return x;
        }

        public int peekFirst() {
            if (size == 0) {
                System.out.println("Deque is Empty");
                return -1;
            }
            return arr[f];
        }

        public boolean isEmpty() {
            return size == 0;
        }


        public void display() {
            if (size == 0) {
                System.out.println("Deque is Empty");
                return;
            }
            for (int i = f; i <= r; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        deque q = new deque();
        q.display();
        q.addFirst(0);
        q.display();
        q.addLast(1);
        q.addLast(2);
        q.addLast(3);
        q.display();
        System.out.println(q.removeFirst());
        q.display();
        System.out.println(q.removeLast());
        q.display();
        System.out.println(q.size);
    }
}
