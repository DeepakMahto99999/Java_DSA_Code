// Given an array where all its element are sorted in increasing order
// except two swapped elements , sort it in linear time , Assume there
// are no duplicates in the array.
// Input: A[] = {3,8,6,7,5,9,10}
// Output: A[] = {3,5,6,7,8,9,10}


public class Q1 {

    static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void sortArr(int[] num){
        int n = num.length;
        int x = -1 , y = -1;
        if(n <=1){ // corner case , edge case
            return;
        }
        for (int i = 1; i < n; i++) {
            if(num[i-1] > num[i]){
                if(x == -1){ // first conflict
                    x = i -1;
                    y =i;
                } else { // 2nd conflict
                    y = i;
                }
            }
        }

        // swap x , y in num
        int temp = num[x];
        num[x] = num[y];
        num[y] = temp;
    }

    public static void main(String[] args) {
        int[] num = {3,8,6,7,5,9,10};
        sortArr(num);
        printArr(num);
    }
}
