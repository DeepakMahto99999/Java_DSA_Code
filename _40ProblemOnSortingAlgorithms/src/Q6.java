// Q4 - Given an array of n elements, the task is to find the
// elements that are greater than half of elements in an array.
// In case of odd elements, we need to print elements larger than floor(n/2)
// element where n is the total number of element in the array.


public class Q6 {

    static void  greaterElement(int[] arr){
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int j =i;
            while (j > 0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        for (int i =n/2 ; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
      int[] arr = {10, 4, 2, 8, 9};
      greaterElement(arr);
    }
}
