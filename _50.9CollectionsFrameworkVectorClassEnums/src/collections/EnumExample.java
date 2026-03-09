package collections;

public class EnumExample {
    enum Week implements A {  // Enum declaration
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are enum constants
        // Enums are implicitly public, static, and final
        // Since they are final, you cannot create child enums
        // The type of this enum is "Week"

        Week() {   // Constructor of enum
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void hello() {
            System.out.println("hey how are you");
        }
        // This method is implemented because the enum implements the interface A
        // Enum can implement interfaces but cannot extend a class

        // Enum internally works like:
        // public static final Week Monday = new Week();
    }

    public static void main(String[] args){
        Week week;
        week = Week.Monday;  // Assigning an enum constant to a variable
        week.hello();        // Calling the method from the enum

        System.out.println(week.valueOf("Monday"));
        // The valueOf() method returns the enum constant with the specified name.

        // Uncomment this to print all values of the enum
//        for(Week day: week.values()){
//            System.out.println(day);
//        }

        // System.out.println(week.ordinal());
        // ordinal() returns the position of the constant in the enum, starting from 0.
    }
}
