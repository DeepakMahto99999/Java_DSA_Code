import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;


public class practice {
    public static void main(String[] args) {
//        Integer i = Integer.valueOf(4);
//        System.out.println(i);

        List<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);


//        To add multiple elements
//        List<Integer> newElements = Arrays.asList(1, 2, 3, 4);
//        l1.addAll(newElements);
         l1.addAll(Arrays.asList(1,2,3,4));

          System.out.println(l1.get(1));

        System.out.println(l1);
        l1.add(1,100);
        System.out.println(l1);
        l1.set(1,25);
        System.out.println(l1);

        boolean ans = l1.contains(Integer.valueOf(22));
        System.out.println(ans);
        System.out.println(l1.remove((Integer.valueOf(33)) ));

    }
}
