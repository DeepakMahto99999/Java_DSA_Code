import java.util.HashMap;

public class _3TwoSum {

   static int[] twoSum(int[] arr , int target){
       int n = arr.length;

       int[] ans = {-1};
       for (int i = 0; i < n-1; i++) {
           int n2 = target - arr[i];
           for (int j = i+1; j < n ; j++) {
               if(n2 == arr[j]) {
                  ans = new int[]{i,j};
                  return ans;
               }
           }
       }
       return ans;
   }

    static int[] twoSum2(int[] arr , int target){
       int n = arr.length;
       int[] ans = {-1};

       // value , index
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner = target - arr[i];
            if(mp.containsKey(partner)){
                ans = new int[]{i,mp.get(partner)};
                return ans;
            }
            mp.put(arr[i],i);
        }

       return ans;
    }
    public static void main(String[] args) {
     int arr[] = {1,2,4,5,7,9,10};

     int arr2[] =  twoSum(arr,12);

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }

    }
}
