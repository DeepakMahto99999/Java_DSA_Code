// Rotate the given array "a" by k steps, where k is non-negative.
// Note: k can be greater than n as well


public class _3Q {

    static int[] rotateArray(int[] arr , int k){
        int n = arr.length;
         k = k % n ;
         int[] ans = new int[n];
         int j =0;

        for (int i = n-k; i < n ; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n-k; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i <ans.length ; i++) {
            System.out.print(ans[i]);
        }
         return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =1;
        rotateArray(arr,k);

    }
}
