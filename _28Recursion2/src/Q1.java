// given an integer, find out the sum of its digits using recursion

public class Q1 {

    static int fibonacci(int n){
        if(n ==0 || n==1 ){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }

    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i <=n ; i++) {
        System.out.println(fibonacci(i));
        }
    }
}
