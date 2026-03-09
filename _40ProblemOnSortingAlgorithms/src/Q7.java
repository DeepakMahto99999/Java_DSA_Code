// Given an array, sort it using insertion sort recursively.


public class Q7 {

    static void insertionRecursion(int[] arr, int idx) {
        // Base case: if only one element or idx == 0, it's already sorted
        if (idx <= 0) return;

        // Step 1: Recursively sort first idx-1 elements
        insertionRecursion(arr, idx - 1);

        // Step 2: Insert arr[idx] into the correct position
        int key = arr[idx];
        int j = idx - 1;

        // Move elements greater than key one position ahead
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }

        // Place the key at its correct location
        arr[j + 1] = key;
    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 5, 4, 2};

        insertionRecursion(arr, arr.length - 1);

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
