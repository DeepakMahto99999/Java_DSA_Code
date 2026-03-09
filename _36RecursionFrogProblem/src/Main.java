// There are N stones, numbers 0,1,2,...,N-1. for each i (0<=i<N) the
// height of stones i is hi.There is a frog who is initialy on stone 0.
// He will repeat the following action some number of times to reach
// Stones N-1
// if the frog is currently on stones i, jump to Stone i+1 or Stone i+2
// Here, a cost of |hi-hj| is incurred, where j is the stone to land on.

// Find the minimum possible total cost incurred before the frog
// reaches Stones  N.

// input n =4
// arr[] = 10 30 40 20
// Output =30

public class Main {

    static int best(int[] h , int n , int idx){

        if(idx == n-1) return 0;

        int op1 = Math.abs(h[idx] -h[idx+1]) + best(h,n,idx+1);
        if(idx == n-2) return op1;
        int op2 = Math.abs(h[idx]-h[idx+2]) + best(h,n,idx+2);

        return Math.min(op1 ,op2);

    }

    public static void main(String[] args) {
         int[] h = {10,30,40,20};
        System.out.println(best(h,h.length,0));
    }
}