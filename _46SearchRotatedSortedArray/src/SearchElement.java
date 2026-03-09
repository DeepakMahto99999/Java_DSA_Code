
public class SearchElement {

    static int search(int[] a, int target) {
        int st = 0, end = a.length - 1;


        while(st <= end){
            int mid = st + (end - st)/2;

            if(target == a[mid]){
                return mid;
            } else if(a[mid] < a[end]) { // mid to end is sorted
                if(target > a[mid] && target <= a[end]){
                    st = mid +1;
                } else{
                    end = mid -1;
                }
            } else { // st to min is sorted
                if(target >= a[st] && target < a[mid]){
                    end = mid -1;
                } else {
                    st = mid + 1;
                }
            }
        }

            return -1;

    }

    public static void main(String[] args) {
        //           0  1  2  3  4  5  6
        int[] arr = {6, 7, 8, 1, 2, 3, 4};
        int target =  3;
        System.out.println(search(arr, target));
    }

}

