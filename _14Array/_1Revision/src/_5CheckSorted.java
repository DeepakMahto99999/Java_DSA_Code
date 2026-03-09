public class _5CheckSorted {

    public static void checkSorted(int[] arr){
        int n = arr.length;
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i+1]){
                ascending = false;
            }
            if (arr[i] < arr[i+1]){
                descending = false;
            }
        }
        // Decide the result
        if (ascending) {
            System.out.println("Array is Sorted Forward (Ascending).");
        } else if (descending) {
            System.out.println("Array is Sorted Backward (Descending).");
        } else {
            System.out.println("Array is Not Sorted at All.");
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {1,22,3,4,5};
        checkSorted(arr);
    }
}
