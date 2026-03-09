// Given a non-negative integer c, decide whether there
//are two integers a and b such that a2 + b2 = c.
// Input: 5
//Output: yes
// explanation: 2^2+ 1^2 = 5
// Input: 10
//Output: NO


public class AssignmentQ3 {

    static boolean checkPythagoreous(int n) {
        int left = 0;
        int right = (int) Math.sqrt(n);

        while (left <= right) {
            int sumOfSquares = left * left + right * right;

            if (sumOfSquares == n) {
                return true;
            } else if (sumOfSquares < n) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        System.out.println("Input: " + n1 + " -> Output: " + (checkPythagoreous(n1) ? "YES" : "NO"));
        System.out.println("Input: " + n2 + " -> Output: " + (checkPythagoreous(n2) ? "YES" : "NO"));
    }
}
