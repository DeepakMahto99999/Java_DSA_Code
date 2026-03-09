// - Given an integer array and an integer k where
//  k < size of array, We need to return the kth smallest element

public class Q5 {

    static int sorting(int[] arr , int k){
        int n =arr.length;
        for (int i = 0; i < n; i++) {
            int min_index =i;
            for (int j = i+1; j < n ; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
             int temp = arr[j];
             arr[j] = arr[min_index];
             arr[min_index] = temp;
            }
        }
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr = {3,5,6,2,1};
        int k = 3;
        System.out.println(sorting(arr ,k));
    }
}
