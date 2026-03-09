// Given a series of N daily price quotes for a stock, we need to
// calculate the span of the stock's price for all N days.
// The span of the stock's price in one day is the maximum number of
// consecutive days(starting from that day and going backward) for
// which the stock price was less than or equal to the price of that day.

// approach
// prev greater element
// if stack is empty then push the i + 1  and push the current index
// if arr[i] greater than arr[st.peek] then pop util empty
// if arr[i] less than prev element  than i - peek

//

import java.util.Stack;

public class Q5StockSpan {

    public static int[] stockSpan(int[] arr) {
        int n = arr.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements from the stack while the current price is higher
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            // If stack is empty, all previous prices are smaller, span = i+1
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }

            // Push current index to the stack
            st.push(i);
        }

        return span;
    }

    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 70, 60, 75, 85};
        int[] res = stockSpan(arr);
        for (int span : res) {
            System.out.print(span + " ");
        }
    }
}

