import java.util.Arrays;
import java.util.HashMap;

public class _6CountUniqueDuplicate {

    public static void countUniqueDuplicate(int[] arr){
        int n = arr.length;
        int countUnique = 0;
        int countDuplicate = 0;

        // To keep track of elements already counted
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;  // skip already counted element

            int freq = 1; // count current element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    freq++;
                    visited[j] = true; // mark duplicate as counted
                }
            }

            if (freq == 1) {
                countUnique++;
            } else {
                countDuplicate++;
            }
        }

        System.out.println("Unique elements count: " + countUnique);
        System.out.println("Duplicate elements count: " + countDuplicate);
    }

    public static void countUniqueDuplicate2(int[] arr){
        int n = arr.length;

        Arrays.sort(arr);
        int uniqueCount = 0;
        int duplicateCount = 0;


        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n && arr[j] == arr[i]) {
                j++;
            }
            int freq = j - i;
            if (freq == 1) {
                uniqueCount++;
            } else {
                duplicateCount++;
            }
            i = j;
        }


        System.out.println("Unique elements count: " + uniqueCount);
        System.out.println("Duplicate elements count: " + duplicateCount);

    }

    public static void countUniqueDuplicate3(int[] arr){
        HashMap<Integer ,Integer> freq = new HashMap<>();

//        for(int num: arr){
//            freq.put(num ,freq.getOrDefault(num,0)+1);
//        }

        for (int num : arr) {
            if (freq.containsKey(num)) {
                int currentCount = freq.get(num); // get current count
                freq.put(num, currentCount + 1);  // increase by 1
            } else {
                freq.put(num, 1); // first occurrence
            }
        }

        int uniqueCount = 0;
        int duplicateCount = 0;

        for (int count : freq.values()){
            if (count == 1){
                uniqueCount++;
            } else{
                duplicateCount++;
            }
        }


        System.out.println("Unique elements count: " + uniqueCount);
        System.out.println("Duplicate elements count: " + duplicateCount);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 3};
         countUniqueDuplicate(arr);
         countUniqueDuplicate2(arr);
         countUniqueDuplicate3(arr);
    }
}
