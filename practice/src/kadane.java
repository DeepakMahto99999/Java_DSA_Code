// At every element, decide whether to continue the previous
// subarray or start a new subarray.


public class kadane {

    public static int maxSubArray(int[] numbers){

        int n = numbers.length;

        if(n == 0) return 0;

        int maxSum = numbers[0];
        int currSum = numbers[0];

        for (int i = 1; i < n; i++) {
            currSum += numbers[i];

            if(numbers[i] > currSum ){
                currSum = numbers[i];
            }

            maxSum = Math.max(maxSum , currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};

         int result =  maxSubArray(numbers);

        System.out.println(result);
    }
}
