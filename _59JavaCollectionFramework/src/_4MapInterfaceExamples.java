// Key - value pair


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _4MapInterfaceExamples {

    static void mapExamples(){
        Map<Integer,String>  mp = new HashMap<>();
        mp.put(3,"Aman");
        mp.put(1,"Rohan");
        mp.put(2,"Riya");


        // iteration over keys in a map
        for (var i : mp.keySet()){
            System.out.println(i);
        }

        // Iteration over keys-value map
        for (var e: mp.entrySet()){
            System.out.println(e);
        }

     //   mp.put(1,"Priya"); // over-rides
//        mp.putIfAbsent(1,"Priya");
//        System.out.println(mp.entrySet());
//        System.out.println(mp);
//        System.out.println(mp.get(2)); // Riya
//        System.out.println(mp.containsKey(4)); // false
//        System.out.println(mp.containsValue("Riya")); // true
//        System.out.println(mp.keySet());
//        System.out.println(mp.values());
    }

    static void LinkedHashMap(){
        Map<Integer,String>  mp = new LinkedHashMap<>();
        mp.put(3,"Aman");
        mp.put(1,"Rohan");
        mp.put(2,"Riya");
        System.out.println(mp);
    }

    static void TreeMap(){
        Map<Integer,String>  mp = new TreeMap<>();
        mp.put(3,"Aman");
        mp.put(1,"Rohan");
        mp.put(2,"Riya");
        System.out.println(mp);
    }

    public static void main(String[] args) {
    //   mapExamples();
     //   LinkedHashMap();
        TreeMap();
    }
}
