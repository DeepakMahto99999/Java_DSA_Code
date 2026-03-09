// Max value on the array

public class Q1 {

    static int maxValue(int[] arr ,int idx){
        int n =arr.length;

        // base case
        if(idx == n-1){
            return arr[idx];
        }

        // small problem -> idx +1, end of the array -> max
        int smallAns = maxValue(arr , idx +1);

        // self work and final ans
        return  Math.max(arr[idx],smallAns);

    }

    public static void main(String[] args) {
        int[] arr = {3,10,13,2,5};
        System.out.println(maxValue(arr, 0));
    }
}
