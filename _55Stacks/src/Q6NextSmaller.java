import java.util.Stack;

public class Q6NextSmaller {

    public static int[] nextSmallerElement(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if (st.isEmpty()){
                ans[i] = -1;
            } else {
                ans[i] = st.peek();
            }

            st.push(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,6,3,5};
        int[] ans = nextSmallerElement(arr);
        for (int re : ans) {
            System.out.print(re+" ");
        }
    }
    }

