// Given a mountain array 'a' of length grater than 3 ,return the index 'i'
// such that arr[0] < arr[1] < ... <arr[i-1]
// < arr[i] > arr[i +1] ...> arr[arr.length -1].
// This index is known as the peak index.


public class peakElementIndex {

    static int peakIndex(int[] arr){
        int n = arr.length;
        int st =0 , end = n-1;
        int index = -1;

        while(st <= end){
         int mid = st + (end -st)/2;

         if(arr[mid] < arr[mid + 1]){
             index = mid + 1;
             st = mid +1;
         } else{
             end = mid -1;
         }
        }
        return index;

    }

    public static void main(String[] args) {
      int[] arr = {0,4,1,0};
    }
}
