// Given an array, find the most frequent element in it. if there are
// multiple elements that appear a maximum number of times print any one
// of them.
// n = 6
// arr[] = {1,3,2,1,4,1};
// output:- 1


import java.util.HashMap;
import java.util.Map;

public class _2MostFreqElement {

    static int mostFreqElement(int[] arr){
        Map<Integer,Integer> mp = new HashMap<>();

        for (int el : arr){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }else {
                mp.put(el,mp.get(el)+1);
            }
        }

        int maxFreq = 0 , ansKey = -1;
        for (var e : mp.entrySet()){
            if (e.getValue() >= maxFreq && e.getValue() > ansKey){
                maxFreq = e.getValue();
                ansKey = e.getKey();
            }
        }

        return ansKey;

    }

    public static void main(String[] args) {
     int[] arr = {1,1,2,2,5};
        System.out.println(mostFreqElement(arr));
    }
}
