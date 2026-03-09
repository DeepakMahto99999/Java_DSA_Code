import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _3SetInterfaceExamples {

    // unordered , unique , Hashing internally
    static void hashsetExamples(){
        HashSet<Integer> st = new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
//        st.add(48);
//        st.add(15);
//        st.add(10);
        System.out.println(st);
        st.add(1);
        st.add(1);
        st.add(2);
        System.out.println(st); // 1 2 3
        st.remove(2);
        System.out.println(st.contains(2)); // false
        System.out.println(st.size()); // 2
    }

    static void linkedHashSet(){
        // order of Intersection LinkedList + HashTable
        LinkedHashSet<Integer> st = new LinkedHashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);
    }

    static void treeSet(){
        // all in sorted order , self-balancing BST  O(logn)
        TreeSet<Integer> st = new TreeSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.add(48);
        st.add(15);
        st.add(10);
        System.out.println(st);
    }

    public static void main(String[] args) {
    //  hashsetExamples();
    //    linkedHashSet();
     treeSet();
    }
}
