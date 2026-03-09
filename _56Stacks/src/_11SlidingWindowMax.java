import java.util.Stack;

public class _11SlidingWindowMax {

    public static int[] maxSlidingWindow(int[] nums , int k){
        int n = nums.length;
        // n - (k-1) = n - k + 1
        int[] ans = new int[n-k+1];
            int z = 0;
        for (int i = 0; i < n-k+1 ; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i; j < i + k ; j++) { // k times
              max = Math.max(max,nums[j]);
            }
            ans[z++] = max;
        }
        // Time complexity : 0(k*n-k+1) -> O(k*n)
        return ans;
    }

    public static int[] maxSlidingWindow2(int[] nums , int k){
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int z = 0;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1] = n;

        for(int i = n-2; i >=0 ; i--) {
          while (!st.isEmpty() && nums[i] >= nums[st.peek()]){
              st.pop();
          }
          if (st.isEmpty()) nge[i] = n;
          else nge[i] = st.peek();
          st.push(i);
        }
        for (int i = 0; i < n - k +1; i++) {
            int j = i;
            int max = nums[j];
          while (j < i+k){ // if last ele is k then out is obese i+k
              max = nums[j];
              j = nge[j]; // because in nge we  store index that why
          }
          ans[z++] = max;
        }
        return ans;
    }

    public static int[] maxSlidingWindow3(int[] nums , int k){
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int z = 0;
        Stack<Integer> st = new Stack<>();
        int[] nge = new int[n];
        st.push(n-1);
        nge[n-1] = n;

        for(int i = n-2; i >=0 ; i--) {
            while (!st.isEmpty() && nums[i] >= nums[st.peek()]){
                st.pop();
            }
            if (st.isEmpty()) nge[i] = n;
            else nge[i] = st.peek();
            st.push(i);
        }
        int j = 0;
        for (int i = 0; i < n - k +1; i++) {
           if (j >= i + k) j = i;
            int max = nums[j];
            while (j < i+k){ // if last ele is k then out is obese i+k
                max = nums[j];
                j = nge[j]; // because in nge we  store index that why
            }
            ans[z++] = max;
        }
        return ans;
    }
    public static void main(String[] args) {
      int[] arr = {1,3,-1,-3,5,3,6,7};
      int[] ans = maxSlidingWindow(arr,3);
        for (int res : ans) {
            System.out.print(res+" ");
        }
    }
}
