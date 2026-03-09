// count the number of triplets whose sum is equal the given value x

public class _2Q {

    static int tripletsSum(int[] arr, int target){
        int ans =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length ; k++) {
                    if(target==arr[i]+arr[j]+arr[k]){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,5,6,3};
        int target =12;
        System.out.println(tripletsSum(arr,target));
    }
}
