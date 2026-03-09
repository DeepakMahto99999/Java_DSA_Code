 class Solution {

    public int nthFibonacci(int n) {
        if (n <= 1) {
            return n; // Base case: 0th or 1st Fibonacci number is n itself
        }
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
//            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b; // Return the nth Fibonacci number
    }

    public static void main(String[] args) {
        Solution obj = new Solution();
        int result = obj.nthFibonacci(5); // Calculates the 5th Fibonacci number
        System.out.println(result); // Output will be 5
    }
}
