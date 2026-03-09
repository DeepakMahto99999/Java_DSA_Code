package learnEncapsulation;

import learnPackage.Person;

public class main {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(12);
        System.out.println(p1.getAge());
    }
}
