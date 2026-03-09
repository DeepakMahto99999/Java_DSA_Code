import java.util.Arrays;
import java.util.HashSet;

public class _8ThreeSum {

    // Time complexity: 0(n^3)
    public static boolean checkThreeSum(int[] arr , int target){
        int n = arr.length;
        for (int i =0; i < n-2; i++){
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (arr[i]+arr[j]+arr[k] == target){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // Time complexity: 0(nlogn + n^2) = 0(n^2)
    public static boolean checkThreeSum2(int[] arr , int target){
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < n-2; i++) {
            int j = i+1 , k = n-1;
            while (j < k){
                int sum = arr[i]+arr[j]+arr[k];
                if( sum == target) return true;
                if(sum < target){
                    j++;
                } else{
                    k--;
                }
            }
        }
        return false;
    }
    // Time complexity:  0(n^2) + space complexity : O(n)
    public static boolean checkThreeSum3(int[] arr , int target){
        int n = arr.length;
        for (int i = 0; i < n-2; i++) {
            HashSet<Integer> seen = new HashSet<>();
            int currentTarget = target - arr[i];

            for (int j = i+1; j < n; j++) {
                int complement = currentTarget - arr[j];
                if(seen.contains(complement)) return true;
                seen.add(arr[j]);
            }

        }
        return false;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,5,6,4,32};
        int target = 11;
        System.out.println(checkThreeSum2(arr, target));
    }
}
