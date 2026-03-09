// Find the square root of the given non negative value x.
//Round it off to the nearest floor integer value.

public class Q2 {

    static int findSquareRoot(int n){

       int st =0 , end = n;
       int ans = -1;

       while(st <= end){
           int mid = st + (end - st)/2;
           int val = mid * mid;

           if(val == n) return mid;
           else if (val < n) {
               ans = mid;
               st = mid +1;
           } else {
               end = mid -1;
           }
       }

        return ans;
    }

    public static void main(String[] args) {
    int x = 4;
        System.out.println(findSquareRoot(x));

    }
}

