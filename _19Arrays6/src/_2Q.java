// Given an integer array "a" , return the prefix sum / running sum in
// in the same array without creating a new array

public class _2Q {

    static int[] makePrefixSumArray(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        return arr;
    }

    public static void main(String[] args){
        int[] arr = {2 , 1,3, 4,5};
        makePrefixSumArray(arr);

    }

}
