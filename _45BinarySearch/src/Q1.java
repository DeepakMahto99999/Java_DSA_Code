// find the first index of target value array is sorted

public class Q1 {

    static int lastOcc(int[] arr, int x) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int result = -1; // Initialize result to -1 (not found)

        while (st <= end) {
            int mid = st + (end - st) / 2; // Calculate mid index

            if (x == arr[mid]) {
                result = mid; // Update result to the current mid index
                st = mid + 1; // Move to the right half to find the last occurrence
            } else if (x < arr[mid]) {
                end = mid - 1; // Move to the left half
            } else {
                st = mid + 1; // Move to the right half
            }
        }
        return result; // Return the last occurrence index or -1 if not found
    }

    static int firstOcc(int[] a , int x ){
        int n = a.length;
        int st =0 , end = n-1;
        int result = -1;

        while(st <=end){
            int mid = st + (end -st)/2;
            if(x == a[mid]){
                result = mid;
                end = mid -1;
            } else if (x < a[mid]){
                end = mid -1;
            } else {
                st = mid +1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
    int[] arr = {1,5,5,5,5,6,6};
    int target =5;
        System.out.println(firstOcc(arr , target));
        System.out.println(lastOcc(arr ,target));

    }
}


