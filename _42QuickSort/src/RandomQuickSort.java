import java.util.Random;

public class RandomQuickSort {

    static void displayArr(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    // Randomized QuickSort function
    static void quickSort(int[] arr, int st, int end) {
        if (st >= end) return;
        int pi = partition(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);
    }

    // Partition method with random pivot selection
    static int partition(int[] arr, int st, int end) {
        // Randomly select a pivot index
        Random random = new Random();
        int pivotIdx = random.nextInt(end - st + 1) + st;

        // Swap pivot with the first element
        swap(arr, st, pivotIdx);

        int pivot = arr[st];
        int count = 0;

        // Count the number of elements less than or equal to the pivot
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) count++;
        }

        int pivotIndex = st + count;
        swap(arr, st, pivotIndex);

        int i = st, j = end;

        // Partition the array
        while (i < pivotIndex && j > pivotIndex) {
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if (i < pivotIndex && j > pivotIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }

        return pivotIndex;
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Original array:");
        displayArr(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        displayArr(arr);
    }
}
