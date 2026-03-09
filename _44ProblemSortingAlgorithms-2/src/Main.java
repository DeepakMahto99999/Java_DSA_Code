// Given an array where all its element are sorted in increasing order
// except two swapped elements , sort it in linear time , Assume there
// are no duplicates in the array.
// Input: A[] = {3,8,6,7,5,9,10}
// Output: A[] = {3,5,6,7,8,9,10}



public class Main {
    // Function to print the array
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    // Function to find the two wrong elements in the array
    static int[] findTwoWrongElements(int[] arr) {
        int n = arr.length;
        int first = -1, second = -1;
        // Traverse the array to find the two wrong elements
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (first == -1) {
                    first = i - 1; // First wrong element index
                }
                second = i; // Second wrong element index
            }
        }

        return new int[] {first, second};
    }

    // Function to swap two elements in the array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10}; // Example array

        System.out.print("Original Array: ");
        printArray(arr);

        // Find the indices of the two wrong elements
        int[] wrongIndices = findTwoWrongElements(arr);

        if (wrongIndices[0] != -1 && wrongIndices[1] != -1) {
            // Swap the two wrong elements
            swap(arr, wrongIndices[0], wrongIndices[1]);
        }

        System.out.print("Corrected Array: ");
        printArray(arr);
    }
}
