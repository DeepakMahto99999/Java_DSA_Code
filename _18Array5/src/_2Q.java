// Sort an array consisting of only 0s and 1s


public class _2Q {

    static void sortArrayszero(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                // Swap the elements
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            if (arr[left] == 0) {
                left++;
            }

            if (arr[right] == 1) {
                right--;
            }
        }

        // Print the sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 1, 1, 0}; // Corrected input
        sortArrayszero(arr);
    }
}
