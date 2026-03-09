// Given an array of integer , print sums of all subsets in it.
// Output sum can be printed in any order

// input: arr[] = {2,3}
// Output: 0 2 3 5

// Input: arr[] = {2,4,5}
// Output: 0 2 4 5 6 7 9 11


public class Q2 {

    static void subsetSum(int[] a , int n, int idx ,int sum){
        // base case
        if(idx >=n) {
            System.out.println(sum);
            return;
        }

        // curr idx  + curr ans
        subsetSum(a,n,idx+1,sum + a[idx]);

        // curr ans
        subsetSum(a,n,idx+1,sum);
    }

    public static void main(String[] args) {
     int[] a = {2,4,5};
     subsetSum(a,a.length ,0,0);
    }
}
