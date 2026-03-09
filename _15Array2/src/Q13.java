// Given an unsorted array arr[] of size N having both
// negative and positive integers, place
//all negative elements at the end of array without
// changing the order of positive elements
//and negative elements




public class Q13 {

    static void Unsorted(int arr[]) {
        int idx = 0;
        int[] ans = new int[arr.length];

        // First loop: Store non-negative elements in ans
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                ans[idx] = arr[i];
                idx++;
            }
        }

        // Second loop: Store negative elements in ans
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[idx] = arr[i];
                idx++;
            }
        }

        // Copy the elements back to the original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {-3, -1, 0, -7};
        Unsorted(arr);

        // Print the updated array to verify the output
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

