import java.util.LinkedList;

public class _3HashMapImplementation {

    static class MyHashMap<K, V>{

        public class Node{
            K key;
            V value;
            Node (K key , V value){
                this.key = key;
                this.value = value;
            }
        }
        
        public static  final int DEFAULT_CAPACITY = 4; // initial size of buckets 0 to 3
        public static  final float DEFAULT_LOAD_FACTOR = 0.75f; // capacity of each bucket
        private int n; // number of key-values pairs (keeps track of how many entries exits in the map)
        public LinkedList<Node> [] buckets; // bucket at each index as an array of LinkedLists.


        // Constructor - bucket array with default capacity 0 to till length of bucket
        public MyHashMap(){
            initBuckets(DEFAULT_CAPACITY);
        }


        // Creates a LinkedList<Node> N empty slots at each index of the bucket array.
        private void initBuckets(int N){ // N - capacity/size of buckets array
            buckets = new LinkedList[N];
            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }
        }


        // Converts key to an index using its hashCode
        // Uses modulo to stay within array bounds.
        private  int HashFunc(K key){
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }



        private void rehash(){
            LinkedList<Node> [] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (var bucket : oldBuckets){
                for(var node : bucket){
                    put(node.key,node.value);
                }
            }
        }



        // Traverses a ll and looks for node with key, if found it returns
        // it's index otherwise it returns null
        private int searchInBucket(LinkedList<Node> ll , K key){
            for (int i = 0; i < ll.size(); i++) {
                if(ll.get(i).key == key){
                    return i;
                }
            }
            return -1;
        }


        public int size(){  // return the number of entries in map
          return n;
        }



        public void put(K key , V value){ // insert/update
           int bi = HashFunc(key);
           LinkedList<Node> currBucket = buckets[bi];
           int ei =  searchInBucket(currBucket , key);
           if (ei == -1){ // key doesn't exits, we have to insert a new node
               Node node = new Node(key,value);
               currBucket.add(node);
               n++;
           }else{  // update case
               Node currNode = currBucket.get(ei);
               currNode.value =value;
           }
           // 3 >= 4 * 0.75
            if(n >= buckets.length * DEFAULT_LOAD_FACTOR){
                rehash();
            }
        }


        public V get(K key){
           int bi = HashFunc(key);
           LinkedList<Node> currentBucket = buckets[bi];
           int ei = searchInBucket(currentBucket,key);
           if(ei != -1){
               Node currNode = currentBucket.get(ei);
               return currNode.value;
           }
               return null;

        }


        public V remove(K key){
            int bi = HashFunc(key);
            LinkedList<Node> currentBucket = buckets[bi];
            int ei = searchInBucket(currentBucket,key);
            if (ei != -1){
                 Node currNode = currentBucket.get(ei);
                 V val = currNode.value;
                 currentBucket.remove(ei);
                 n--;
                 return val;
            }
                return null;

        }


        public int capacity(){
            return buckets.length;
        }

        public float load(){
            return (n*1.0f)/buckets.length;
        }

    }

    public static void main(String[] args) {
     MyHashMap<String,Integer> mp = new MyHashMap<>();
        System.out.println("Testing put");
        mp.put("a",1);
        mp.put("b",2);
        System.out.println("CAPACITY " + mp.capacity()); // 4
        System.out.println("LOAD " + mp.load());
        mp.put("c",3);
        mp.put("x",61);
        mp.put("y",71);
        mp.put("c",30);
        System.out.println("Testing size " + mp.size());


        // Testing get
        System.out.println(mp.get("x")); // 61
        System.out.println(mp.get("y")); // 71

        System.out.println("CAPACITY " + mp.capacity()); // 8
        System.out.println("LOAD " + mp.load()); // < 0.75

    }
}
