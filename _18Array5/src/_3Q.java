// Given an array of integers "a" , move all the even
// integer at the beginning of the array followed by all
// the odd integer . The relative order of odd or even
// integer does not matter . Return any array that satisfies the
// condition.


public class _3Q {

    static void SwapEven(int[] arr){
        int left =0;
        int right = arr.length-1;
        while (left < right){
            if(arr[left] % 2 !=0 && arr[right] % 2 ==0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] =temp;
                left++;
                right--;
            }
            if ( arr[left] % 2 ==0){
                left++;
            } else if (arr[right] % 2 !=0) {
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,9,44,95};
        SwapEven(arr);

    }
}