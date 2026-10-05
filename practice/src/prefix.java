public class prefix {

    public static int maxSubArray(int numbers[]){
        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < numbers.length ; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int start = 0; start < numbers.length; start++) {

            for (int end = start; end < numbers.length; end++) {
                int currSum;

                if(start == 0){
                    currSum = prefix[end];
                }
                else{
                    currSum = prefix[end] - prefix[start-1];
                }

                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};

        maxSubArray(numbers);
    }
}
