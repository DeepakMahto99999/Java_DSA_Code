//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void maxSubArray(int numbers[]) {

        int maxSum = Integer.MIN_VALUE;

        // Choose starting point
        for (int i = 0; i < numbers.length; i++) {

            // Choose ending point
            for (int j = i; j < numbers.length; j++) {

                int currSum = 0;

                // Calculate sum of subarray i to j
                for (int k = i; k <= j; k++) {
                    currSum += numbers[k];
                }

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