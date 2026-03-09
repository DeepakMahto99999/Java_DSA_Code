import java.util.HashMap;

public class _7TwoElementSumTarget {
    
    public static boolean checkTargetSum(int[] arr , int target){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkTargetSum2(int[] arr , int target){
        int n = arr.length;

        HashMap<Integer ,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int value = target - arr[i];
             if(map.containsKey(value)){
                 return true;
             }
             map.put(arr[i],i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,6,4,32};
        int target = 11;
        System.out.println(checkTargetSum2(arr, target));
    }
}
