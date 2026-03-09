public class bitwise {
    public static void main(String[] args) {
        int p =9,q =10;

        System.out.println(p | q); // 1001 | 1010 => 1011 ==> 11
        System.out.println(p & q); // 1001 & 1010 => 1000 ==> 8

        // Bitwise XOR Operator, if two bits are same -> 0 and if two bits are different then 1
        System.out.println(p ^ q); // 1001 ^ 1010 => 0110 ==> 3

        // Bitwise complement
        System.out.println(~p); // 1001 => 0110 ==> 3


        // Left shift
        //      <-
        //  _ _ _1001_
        //  _ _ 10010 => 18
        System.out.println(p << 1);


        // _ _ _1001 ==> _100100 => 36
        System.out.println(p << 2);


        // Right shift
        //          ->
        // _ _ _ 1001
        // _ _ _ _1001
        // _ _ _ 100
        System.out.println(p >> 1); //  4
        System.out.println(p >> 2); // 2

        // a << b = a * 2^b;
        // a << 1 = a * 2

        // a >> b = a / 2^b
        // a >> 1 = a / 2
    }
}