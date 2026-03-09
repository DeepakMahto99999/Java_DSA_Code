// Given a number n. Find the sum of natural numbers
// till n but with alternate signs.

public class Q1 {

    static int seriesSum1(int n ){
        if (n == 0) {
            return 0;
        }
        return seriesSum1(n-1) + n;
    }

   static int alternateSum(int n){
     if(n==0){
      return 0;
     }
       if (n % 2== 0)
        return alternateSum(n-1) -n ;
       else  return alternateSum(n-1) + n;
   }


    public static void main(String[] args) {
        int n = 5;
        System.out.println(seriesSum1(n));
        System.out.println(alternateSum(n));
    }
}
