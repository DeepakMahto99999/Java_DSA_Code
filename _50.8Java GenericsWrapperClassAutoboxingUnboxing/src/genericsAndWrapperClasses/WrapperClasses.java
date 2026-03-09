package genericsAndWrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        Integer obj = 12; // ✅ Autoboxing
        Integer obj2 = Integer.valueOf("12");

        System.out.println(obj2*4);

        Boolean myBoolean = Boolean.valueOf("false");

        int age = obj; // unboxing


    }
}
