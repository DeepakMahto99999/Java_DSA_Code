// p power , q

public class Q3 {

//    static int power(int p , int q){ // TC - O(q)
//      if(q ==0) return 1;
//
//      return power(p,q-1)*p;
//    }


    static int power(int p , int q){
        if(q ==0) return 1;

        int smallPower = power(p, q/2);

         if(q % 2 ==0){ //even
             return smallPower * smallPower;
         }
             return p* smallPower * smallPower;
    }

    public static void main(String[] args) {
        int p = 2;
        int q = 5;
        System.out.println(power(p,q));
    }
}
