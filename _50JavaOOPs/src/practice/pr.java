package practice;

class aluu {
   protected String name;
    int age;

    public aluu(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class pr {
    public static void main(String[] args) {
        aluu obj = new aluu("Deepak", 20);
        System.out.println(obj.name);
//        obj.address = "Mumbai";
    }
}
