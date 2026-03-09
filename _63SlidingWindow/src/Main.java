public class Main {


    static int maxSubArraySum(int[] arr , int k){
        int n = arr.length;
        int max = 0;

        for(int i =0; i < n -k +1;i++){
            int sum = 0;
            for (int j = i; j < i+k ; j++) {
                sum +=arr[j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }

    static int maxSubArraySum2(int[] arr , int k){
        int n = arr.length;
        int max = 0;

        
        for (int i = 0; i < k; i++) {
           max += arr[i];
        }

        int windowSum = max;

        for (int i = k; i < n; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            max = Math.max(max,windowSum);
        }

        return max;
    }

    public static void main(String[] args) {
        
     int[] arr = {7,1,8,10,12,0,5};
     System.out.println(maxSubArraySum(arr,3));

    }
}