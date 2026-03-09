public class exercise {

    public static void main(String[] args) {
        Integer c = 200;
        Integer d = 200;

        System.out.println(c == d);  // false (no cache)

        Integer a = 4;
        Integer b = 4;

        System.out.println(a == b);  // true (cached)


    }
}
