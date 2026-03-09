// Given an array of integers of size n . Answer q queries where
// you need to print the sum of values in a given range of
// indices from 1 to r (both included).
// Note: The values of l and r in queries follow 1- based indexing.


public class _3Q {

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        int[] prefixSum = new int[n];

        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static void main(String[] args) {
        int[] arr = {2,4,1,3,6};

        int[] presum = makePrefixSumArray(arr);

        int l = 1;
        int r = 5;

        int ans = presum[r - 1] - (l > 1 ? presum[l - 2] : 0);
        System.out.println(ans);
    }
}
