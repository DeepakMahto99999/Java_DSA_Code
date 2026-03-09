// You are given an integer array A[] and a window size K.
// Your task is to find the first negative number in every sliding window of size K.
// If no negative number exists in a window, put 0.

// logic
// This code uses a queue to store indices of negative elements and then
// slides a window of size K to pick the first negative number from each
// window.


import java.util.LinkedList;
import java.util.Queue;

public class _6FirstNegative {

    public static int[] firstNegInt(int A[], int K){
        int N = A.length;
        int[] res = new int[N - K + 1];
        Queue<Integer> q = new LinkedList<>();

        // Step 1: Store indices of negative elements
        for (int i = 0; i < N; i++) {
            if (A[i] < 0)
                q.add(i);
        }

        // Step 2: Slide window
        for (int i = 0; i <= N - K; i++) {
            // Remove indices out of window
            if (!q.isEmpty() && q.peek() < i)
                q.remove();

            // If there's a negative element in current window
            if (!q.isEmpty() && q.peek() <= i + K - 1) {
                res[i] = A[q.peek()];
            } else {
                res[i] = 0;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-8, 2, 3, -6, 10};
        int[] res = firstNegInt(arr, 2); // Store result
        for (int val : res) {
            System.out.print(val + " ");
        }
    }
}
