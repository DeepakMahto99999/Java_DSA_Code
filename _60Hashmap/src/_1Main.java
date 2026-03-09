import java.util.*;


public class _1Main {

    static void HashMapMethods(){
        // Syntax
        Map<String , Integer> mp = new HashMap<>();

        // Adding Element
        mp.put("Akash",21);
        mp.put("Yash",16);
        mp.put("Lav",17);
        mp.put("Rishika",19);
        mp.put("Harry",18);

        // Getting value of a key from the HashMap
        System.out.println(mp.get("Yash")); // 16
        System.out.println(mp.get("Rahul")); // null

        // changing/updating value of a key in the HashMap
        mp.put("Akash",25); // Akash ---> 25
        System.out.println(mp.get("Akash"));

        //Removing a pair of the HashMap
        System.out.println( mp.remove("Akash")); // 25
        System.out.println( mp.remove("riya"));  // null

        // Checking if a key is in the HashMap
        System.out.println(mp.containsValue("Akash"));
        System.out.println(mp.containsValue("Yash"));

        // Adding a new entry only if the new key doesn't exits already
        mp.putIfAbsent("Yashika",30);
        mp.putIfAbsent("Yash",30);

        // Get all keys in the Hashmap
        System.out.println(mp.keySet());

        // Get all value in the Hashmap
        System.out.println(mp.values());

        // Get all entries in the Hashmap
        System.out.println(mp.entrySet());

        // Traversing all entries of Hashmap - multiple methods
        for (String key : mp.keySet()){
            System.out.printf("Age of %s is %d\n" , key , mp.get(key));
        }

        System.out.println();

        for (Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }

        System.out.println();
        for (var e : mp.entrySet()){
            System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
        }
    }

    public static void main(String[] args) {
        HashMapMethods();
    }
}