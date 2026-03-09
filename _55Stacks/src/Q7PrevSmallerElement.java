import java.util.Stack;

public class Q7PrevSmallerElement {

    public static int[] prevSmallerElement(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,2,4,6,3,5};
        int[] ans = prevSmallerElement(arr);
        for (int re : ans) {
            System.out.print(re+" ");
        }
    }
    }

