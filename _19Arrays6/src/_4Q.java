// Check if we can partition the array into two subarrays with
// equal sum. More formally, check that the prefix sum of a part
//  of the array is equal to the suffix sum of rest of the array.


public class _4Q {

     static boolean equalSumSubArray(int[] arr){
         int n = arr.length;


         if (n < 2) {
             return false; // Can't partition an array with less than 2 elements
         }

         int[] prefix = new int[n];

         int[] suffix = new int[n];

         prefix[0] = arr[0];
         for (int i = 1; i < n; i++) {
             prefix[i] = prefix[i - 1] + arr[i];
         }

         suffix[n - 1] = arr[n - 1];
         for (int i = n - 2; i >= 0; i--) {
             suffix[i] = suffix[i + 1] + arr[i];
         }

         for (int i = 0; i < n-1; i++) {
             if(prefix[i]==suffix[i+1]){
                 return true;
             }
         }

         return false;

     }

    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 3, 1};
        boolean result = equalSumSubArray(arr);
        System.out.println("Can the array be partitioned? " + result);

    }
}
