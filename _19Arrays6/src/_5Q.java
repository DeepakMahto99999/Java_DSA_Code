public class _5Q {

    static boolean equalSumSubArray(int[] arr){
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        int prefSum =0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
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
