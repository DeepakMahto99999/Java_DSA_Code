// A rotate sorted array is given find the index of the minimum element

public class Main {

    static int findMinimum(int[] arr){
        int n = arr.length;
        int st = 0 , end = n-1;
        int ans = -1;

        while(st <= end){
            int mid = st + (end -st)/2;
            if(arr[mid] <= arr[n-1]){
                ans = mid;
                end = mid -1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //        0 1 2 3 4 5 6 7 8
     int[] arr = {5,6,7,8,9,10,1,2,3};
        System.out.println(findMinimum(arr));
    }
}