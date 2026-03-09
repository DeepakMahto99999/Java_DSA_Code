// Given an integer array , move all 0's to the end of it while
// maintaining the relative order of the non-zero elements

// hint: Bubble sort

public class Q1 {

    static void moveZerosToEnd(int[] arr){
        int n =arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-1-i; j++) {
               if(arr[j]==0 && arr[j+1] !=0){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
                   flag = true;
               }
            }
            if(!flag){
                return;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 4,2};
        int n = arr.length;
        moveZerosToEnd(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
