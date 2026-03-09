 //        [1,2,3] , 0(index) , ans
 //        0                   1 swap(0,1) index         2
 //  [1,2,3] , 1 , ans        [2,1,3] , 1, ans        [3,2,1] , 1 , ans
 //  1           2               1     2                1     2
 // [1,2,3], 2   [1,3,2] , 2   [2,1,3],2  [2,3,1],2     [3,2,1] 2  , [3,1,2] 2
 // jab index last number ban jayega n -1 to return kar do
 //


 import java.util.ArrayList;

 public class _9allPermutationArrayOptimize {

     public static void main(String[] args) {
         int[] arr = {1, 2, 3};
         ArrayList<ArrayList<Integer>> result = allPermutation(arr);

         // Print all permutations
         for (ArrayList<Integer> perm : result) {
             System.out.println(perm);
         }
     }

     public static void helper(int[] nums, int idx ,  ArrayList<ArrayList<Integer>> ans) {
         int n = nums.length;

         if (idx == n-1) {
            ArrayList<Integer> l = new ArrayList<>();
             for (int i = 0; i < n; i++) {
                 l.add(nums[i]);
             }
             ans.add(l);
             return;
         }

         for (int i = idx; i < nums.length; i++) {
           swap(i,idx,nums);
           helper(nums,idx+1,ans);
           swap(i,idx,nums);
         }
     }

     public static void swap(int i , int j , int[] nums){
         int temp = nums[i];
         nums[i] = nums[j];
         nums[j] = temp;
     }

     public static ArrayList<ArrayList<Integer>> allPermutation(int[] nums) {
         ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         helper(nums, 0, ans);
         return ans;
     }
}
