// approach
//1. Inputs:
//    nums[]      → original array (example: [1, 2, 3])
//    isValid[]   → boolean array, same length as nums, all false initially
//                  false → number not used yet → can choose
//                  true  → number already used → skip
//    ds          → current path (partial permutation)
//    ans         → list of all permutations
//
//  num = [1,2,3], ds = [], isValid = [F,F,F]
//
//       1                         2                       3
// [1,2,3] , [1] , [T,F,F]    [1,2,3] , [2] , [F,T,F]    [1,2,3] , [3] , [F,F,T]
//            |
//            ^ IF number is true then call not happen
// ❌1(bcoz->T)       2          3
//                     | (3 call for no. 2)
//         [1,2,3] , [1,2] , [T,T,F]    then again three call
//      ❌1(bcoz->T)     ❌2(bcoz->T)     *3
//                  [1,2,3] , [1,2,3] , [T,T,T]
//                 if [] is == [1,2,3] then stop call return
//                  [1,2,3] insert in ans which is [] one full and backtracking
//                  then *3 will again three call




import java.util.ArrayList;

public class _8allPermutationInArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> result = allPermutation(arr);

        // Print all permutations
        for (ArrayList<Integer> perm : result) {
            System.out.println(perm);
        }
    }

    public static void helper(int[] nums, ArrayList<Integer> ds, boolean[] isValid, ArrayList<ArrayList<Integer>> ans) {
        int n = nums.length;

        if (ds.size() == n) {
            ans.add(new ArrayList<>(ds));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!isValid[i]) { // call lag
                ds.add(nums[i]);
                isValid[i] = true;
                helper(nums, ds, isValid, ans); // Recursive call
                isValid[i] = false; // Backtrack
                ds.remove(ds.size() - 1); // Remove last added
            }
        }
    }

    public static ArrayList<ArrayList<Integer>> allPermutation(int[] nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> ds = new ArrayList<>();
        boolean[] isValid = new boolean[nums.length];

        helper(nums, ds, isValid, ans);

        return ans;
    }

}
