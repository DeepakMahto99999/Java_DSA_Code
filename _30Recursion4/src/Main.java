//
public class Main {

    static void multiply(int n , int k){
        if(k== 1) return;
        multiply(n,k-1);

        System.out.println(n * k);
    }

    public static void main(String[] args) {
        int n = 12;
        int k =4;
      multiply(n,k);
    }
}