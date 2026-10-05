public class Main2 {

    public static void maxSubArray(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;

        // Choose starting point
        for (int i = 0; i < numbers.length; i++) {

            int currSum = 0;

            // Choose ending point
            for (int j = i; j < numbers.length; j++) {

                currSum += numbers[j];

                // Update maximum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Max sum = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};

        maxSubArray(numbers);

    }
}
