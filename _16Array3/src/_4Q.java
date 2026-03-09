// Find the second largest element in the Array

public class _4Q {

    static int SecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int max2 =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max2 = max;
                max = arr[i];
            } else if (arr[i] > max2 && arr[i]!=max ) {
                max2 = arr[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        int arr[] = {9,8,9,6,9,5};
        System.out.println(SecondLargest(arr));
    }
}
