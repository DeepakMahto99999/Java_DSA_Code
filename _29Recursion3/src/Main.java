public class Main {

  static   int sumOfSeries(int n){
        if(n==1){
            return n;
        }
        return n + sumOfSeries(n -1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfSeries(n));
    }
}