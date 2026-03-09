// Search element in rotated sorted array with duplicate element.
// Return true if the element is found , else return false.
// input:
// [0,0,0,1,1,1,2,0,0,0], target =2
// true;


public class SearchElement2 {

    static boolean search(int[] arr , int t){
        int n = arr.length;

        int st =0 , end = n-1;

        while (st <= end){
            int mid = st + (end -st)/2;

            if(t == arr[mid]){
                return true;
            } else if (arr[st]==arr[mid] && arr[end] == arr[mid]) {
                st++;
                end--;
            } else if(arr[mid] <= arr[end]){
                if(t > arr[mid] && t <= arr[end]){
                    st = mid +1;
                } else {
                    end = mid -1;
                }
            } else {
                if(t >= arr[st] && t < arr[mid]){
                    end = mid -1;
                } else {
                    st = mid +1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
         int[] arr ={0,0,0,1,1,1,2,0,0,0};
         int target = 2;
        System.out.println(search(arr , target));
    }
}
