public class peakElement {

    static int peakElement(int[] arr){
        int n = arr.length;
        int st = 0 , end = n-1;
        int ans = 0;

        while(st <= end){
            int mid = st + (end -st)/2;

            if((mid == 0|| arr[mid] > arr[mid-1]) &&
                ( mid == n-1 || arr[mid] > arr[mid+1])){
                return mid;
            }

            if(arr[mid] < arr[mid+1]){
                st = mid +1;
            } else {
                end = mid-1;
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1};
        System.out.println(peakElement(arr));
    }
}
