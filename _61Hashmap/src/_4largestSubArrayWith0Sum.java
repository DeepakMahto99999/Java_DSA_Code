import java.util.HashMap;

public class _4largestSubArrayWith0Sum {

    public static int maxLen(int[] arr){
        HashMap<Integer,Integer> mp = new HashMap<>();

        int maxLen = 0 , preSum = 0;

        mp.put(0,-1);
        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (mp.containsKey(preSum)){
                maxLen = Math.max(maxLen , i - mp.get(preSum));
            }else {
                mp.put(preSum,i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println("Length of the longest sub-array with 0 sum: " + maxLen(arr));
    }
}

// Two sum ---> do three sum
// largest  ----> given array how many sub-array with sum target