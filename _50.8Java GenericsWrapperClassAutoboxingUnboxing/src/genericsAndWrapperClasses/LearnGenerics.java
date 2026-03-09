package genericsAndWrapperClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class LearnGenerics {
    public static void main(String[] args) {
        Dog<String> d1 = new Dog<>("asdf123");
        Dog<String> d2 = new Dog<>("oeiur12");

        Dog<Integer> d3 = new Dog<>(12);

        System.out.println(d3.getId());

        ArrayList<Integer> a = new ArrayList<>();
    }
}

class Dog<E > {
    E id;
//    V name;


    public Dog(E id ){
        this.id = id;
//        this.name = name;
    }

    E getId(){
        return id;
    }
}
