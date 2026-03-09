// count digit using recursion

public class Q2 {

    static int countDigit(int n){
        //base case
        if(n/10 == 0){
            return 1;
        }

        return countDigit(n/10)+1;
    }

    public static void main(String[] args) {
          int n = 322;
          System.out.println(countDigit(n));
    }
}
