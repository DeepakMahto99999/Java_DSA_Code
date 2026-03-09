// approach:-1 ---> pop , ans , push
// traversal the arr from the last of array
// mark the last element -1  and push the element in stack
// then traversal the array if current element is bigger than st.peek()
// then pop the element util stack will empty and no element left than put -1 in result array
// if stack element is bigger than put in the array
// push the element in stack every time


// approach:- 2 ----> ans , pop , push
// traversal the array from left to right
// push the index 0
// if current element of array is bigger than st.peek() than put in ans array
// and pop that element
// push the index of current element


import java.util.Arrays;
import java.util.Stack;

public class Q4NextGreaterElement {


    public static int[] nextGreaterElement(int[] arr){
        int n = arr.length;

        Stack<Integer> st = new Stack<>();
        int[] res = new int[n];

        res[n-1] = -1;
        st.push(arr[n-1]);

        for (int i = n-2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if (st.isEmpty()) {
                res[i] = -1;
            } else{
                res[i] = st.peek();
            }
            st.push(arr[i]);
        }
        return res;
    }


    public static int[] nextGreaterElementMethod2(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];

        Arrays.fill(ans, -1);

        st.push(0);

        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]){
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3,2,1,8,6,3,4};
        int[] res = nextGreaterElement(arr);
        int[] ans = nextGreaterElementMethod2(arr);
        for (int re : res) {
            System.out.print(re + " ");
        }
        System.out.println();
        for (int re : ans) {
            System.out.print(re + " ");
        }
    }
}
