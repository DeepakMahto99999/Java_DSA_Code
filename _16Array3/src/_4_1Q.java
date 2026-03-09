// Find the second largest element in the Array

public class _4_1Q {

    static int SecondLargest(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==max){
            arr[i]=secondMax;
            } else if(arr[i] > secondMax){
                secondMax = arr[i];
            }
        }
    return secondMax;
    }

    public static void main(String[] args) {
        int arr[] = {9,8,9,6,9,5};
        System.out.println(SecondLargest(arr));
    }
}
