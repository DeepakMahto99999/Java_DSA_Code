// Rotate the given array "a" by k steps, where k is non-negative without
// using extra space also k can be greater than


public class _4Q {

    // Function to reverse a portion of the array
    static void reverse(int[] arr, int st, int end) {
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;

            st++;
            end--;
        }
    }

    // Function to rotate the array in place
    static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n

        // Reverse the first part
        reverse(arr, 0, n - k - 1);

        // Reverse the second part
        reverse(arr, n - k, n - 1);

        // Reverse the whole array
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        // Rotate the array
        rotateInPlace(arr, k);

        // Print the rotated array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
