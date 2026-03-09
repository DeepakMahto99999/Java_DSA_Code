// find peak element

public class Q11 {

    static int peakElement(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if ((i == 0 || arr[i] >= arr[i - 1]) &&
                    (i == n - 1 || arr[i] >= arr[i + 1])) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
         int[] arr = {1, 2, 4, 5, 7, 8, 3};
        int peakIndex = peakElement(arr);
        System.out.println("Peak element index: " + peakIndex);
        System.out.println("Peak element value: " + arr[peakIndex]);
    }

}