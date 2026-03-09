// Given an integer array "a" sorted in non-decreasing order,
// return an array of the squares of each number
// sorted in non-decreasing order.

// Given an array of integers "a" , move all the even
// integer at the beginning of the array followed by all
// the odd integer . The relative order of odd or even
// integer does not matter . Return any array that satisfies the
// condition.


public class _4Q {

    static int[] SortedInNonDecreasing(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = n-1;

        // Calculate squares and sort in reverse order
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }


        // Print the result
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, -2, 1, 4, 5};
        SortedInNonDecreasing(arr);
    }
}
