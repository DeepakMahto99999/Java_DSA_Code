// write a program to Reverse the given ArrayList.
//  Input -[0,10,3,5,22,10]
//  Output -[10,22,5,3,10,0]


import java.util.ArrayList;
import java.util.Collections;

public class _1Q {

    static void reverseList(ArrayList<Integer> list){
     int i =0;
     int j = list.size() - 1;

     while (i < j){
         Integer temp = Integer.valueOf(list.get(i));
         list.set(i , list.get(j));
         list.set(j , temp);
         i++;
         j--;
     }
    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("Original List " + list);
        Collections.reverse(list);
        //reverseList(list);
        System.out.println("Reverse List " + list);
        Collections.sort(list);
        System.out.println("Ascending order " + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Descending orer " + list);
    }

}
