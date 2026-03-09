
public class Q2 {

    static int summation(int m, int n){
         if(m == 1){
             return n*(n+1)/2;
         }

         int sum = summation(n, m-1);

         return sum*(sum + 1) /2;
    }

    public static void main(String[] args) {
        int m = 2;
        int n =3;
        System.out.println(summation(m,n));
    }
}
