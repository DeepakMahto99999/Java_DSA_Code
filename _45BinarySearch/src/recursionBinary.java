

public class recursionBinary {

    static boolean binarySearch(int[] a , int st , int end , int target){
        if (st > end) return false;
        int mid = st + (end - st)/2;
        if(target == a[mid]){
            return true;
        } else if (target < a[mid]) {
            return binarySearch(a ,st , mid -1 ,target);
        } else {
            return binarySearch(a ,mid +1 , end ,target);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        System.out.println(  binarySearch(arr , 0 , arr.length-1  ,target));

    }
}
