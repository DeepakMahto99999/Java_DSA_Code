// 1. Given an sorted array of integers and a key element,
// you need to print the index where the element is
// present. If the target element is not present in the array, print -1.
// N=10, target= 5
// Array = 1 3 3 4 5 8 9 11 15 15
// Index found at 4

public class AssignmentQ1 {

    static int searchTarget(int[] arr , int t){
        int n = arr.length;
        int st =0 , end = n-1;

        while (st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid]==t){
                return mid;
            }
            else if (t < arr[mid]) {

                end = mid -1;
            } else{
                st = mid +1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {1 ,3, 3, 4, 5, 8, 9, 11, 15, 15};
        int target = 5;
        System.out.println(searchTarget(arr , target));
    }
}
