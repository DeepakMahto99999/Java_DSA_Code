package genericsAndWrapperClasses;

public class GenericMethods {

    public static void main(String[] args){
        printData("Hello");
        printData(123);

        GenericMethods obj = new GenericMethods();
        obj.doubleData("122");
        obj.dData(123);
    }


    static <E> void printData(E data){
        System.out.println(data);
    }

    <E> void doubleData(E data){
        System.out.println(data);
    }

    static <E extends Number> void dData(E data){
        System.out.println(data.doubleValue() * 2);
    }

}
