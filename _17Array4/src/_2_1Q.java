// Reverse an array consisting of integer values.

public class _2_1Q {

    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;

        // Traverse the array in reverse order and populate the `ans` array.
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }

        // Print the reversed array.
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println(); // Move to the next line after printing the array.

        // Return the reversed array.
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        reverseArray(arr);
    }
}

