// Write a program to sort an ArrayList of Strings in
// descending order.

import java.util.ArrayList;
import java.util.Collections;

public class _2Q {

    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Welcome");
        l1.add("To");
        l1.add("Physics");
        l1.add("Wallah");
        System.out.println("OG " + l1);
        Collections.sort(l1 , Collections.reverseOrder());
        System.out.println("sorted " + l1);
    }
}
