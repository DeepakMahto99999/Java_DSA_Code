public class practice {


    public static void main(String[] args) {


      String c = new String("Deepak");
      String d = new String("Deepak");

      String e = c.intern();

        System.out.println(e == d);
        System.out.println(c ==d);
        System.out.println(c == e);

    }
}
