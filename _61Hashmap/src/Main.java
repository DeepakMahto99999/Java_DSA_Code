import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> head1 = new LinkedList<>();
        head1.add(10);
        head1.add(20);
        head1.add(30);

// Create a separate LinkedList and copy elements
        LinkedList<Integer> newList = new LinkedList<>(head1);

// Now newList contains all elements of head1
        System.out.println("Original List: " + head1);
        System.out.println("Copied List: " + newList);

    }
}