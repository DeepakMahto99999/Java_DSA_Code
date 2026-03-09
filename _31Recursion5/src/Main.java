public class Main {

    static int iGCD(int x , int y){
        while (x % y !=0){
            int rem = x % y;
            x =y;
            y =rem;
        }
        return y;
    }

    static int gcd(int x , int y){
        if(y ==0) return x;

        return gcd(y, x % y);
    }

    public static void main(String[] args) {
        int x = 12;
        int y = 16;
        System.out.println(iGCD(x,y));
        System.out.println(gcd(x,y));

}
}
