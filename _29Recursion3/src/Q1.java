// Find out sum of its digit using recursion
public class Q1 {

    static int sumOfDigit(int n){
        if ( n >= 0 && n <= 9){
            return n;
        }

        //recursive work --> small ans
        int smallAns = sumOfDigit(n/10);

        //self work
        int ans = smallAns + n % 10;


        return ans;

    }

    public static void main(String[] args) {
      int n = 1234;
        System.out.println(sumOfDigit(n));
    }
}
