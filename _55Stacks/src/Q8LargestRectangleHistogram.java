import java.util.Stack;

public class Q8LargestRectangleHistogram {



  public static int largestRectangleArea(int[] heights) {
            int n = heights.length;
            int maxArea = 0;

     for (int i = 0; i < n; i++) {
        int height = heights[i];
        // Expand to the left
         int left = i;
         while (left > 0 && heights[left - 1] >= height) {
                    left--;
        }
        // Expand to the right
         int right = i;
         while (right < n - 1 && heights[right + 1] >= height) {
          right++;
         }
        int width = right - left + 1;
        int area = height * width;

        maxArea = Math.max(maxArea, area);
        }

       return maxArea;
     }


    public static int largestRectangleArea2(int[] heights){
        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];
        // calculate nextSmallerElement[]
        for (int i = n-1; i >=0 ; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if (st.isEmpty()){
                nse[i] = n;
            }else {
                nse[i] = st.peek();
            }
            st.push(i);
        }
         // emptying stack
        while (!st.isEmpty()) st.pop();
        // calculate prevSmallerElement[]
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            if (st.isEmpty()){
                pse[i] = -1;
            }else {
                pse[i] = st.peek();
            }
            st.push(i);
        }

        // maximum area of rectangle
        int max = -1;
        for (int i = 0; i < n; i++) {
            int area = heights[i]*(nse[i] - pse[i]-1);
            max = Math.max(max,area);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 4, 6, 3, 5};
        System.out.println(largestRectangleArea(arr));
        System.out.println(largestRectangleArea2(arr));
    }
}
