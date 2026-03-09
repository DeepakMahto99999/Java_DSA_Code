import java.util.Arrays;

class Solution {
    // Function to find triplets with zero sum
    public boolean findTriplets(int[] arr) {
        // Sort the array
        Arrays.sort(arr);
//   {-3, -2, -1, 0, 1, 2, 3}

        // Iterate through the array
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];

                // If a triplet with sum 0 is found
                if (sum == 0) {
                    return true;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // If no triplet with sum 0 is found
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr =  {-3, 1, -2, 0, 2, 3, -1};
        System.out.println(solution.findTriplets(arr)); // Output: true
    }
}

