package learnPackage;

public class Person {

    private int age;

    private String name;

    boolean canBeChanged = true;

    public void setAge(int age){
        if(canBeChanged) {
            if(age > 0){
            this.age = age;
            }
        }
    }

    boolean CanBeChanged =false;

    public int getAge(){
        if(canBeChanged) return age;
 return -1;
    }
}
