// 1. Static Methods Can Only Access Static Variables
// 2. A Static Method Can Only Call Other Static Methods
// 3.  Static Methods Can't Refer to Non-Static Variables or Methods


class ExampleStatic {

    // Static variable
    static int staticVar = 10;

    // Non-static (instance) variable
    int instanceVar = 20;

    //  Static Methods Can Only Access Static Variables
    static void staticMethod1() {
        System.out.println("Static Method 1 called");

        // Accessing static variable (OK)
        System.out.println("Static Variable: " + staticVar);

        // Attempting to access instance variable directly (ERROR if uncommented)
        // System.out.println(instanceVar);
    }

    // Non-static (instance) method
    void instanceMethod() {
        System.out.println("Instance Method called");
    }

    //  A Static Method Can Only Call Other Static Methods
    static void staticMethod2() {
        System.out.println("Static Method 2 called");

        // Calling another static method (OK)
        staticMethod1();

        // Attempting to call an instance method directly (ERROR if uncommented)
        // instanceMethod();
    }

    //  Static Methods Can't Refer to Non-Static Variables or Methods
    static void staticMethod3() {
        System.out.println("Static Method 3 called");

        // Accessing instance members using an object
        ExampleStatic obj = new ExampleStatic();
        System.out.println("Accessing Instance Variable via Object: " + obj.instanceVar);
        obj.instanceMethod(); // Calling instance method via object
    }


    public static void main(String[] args) {
        // Calling static methods directly
        staticMethod1();
        staticMethod2();
        staticMethod3();
    }
}

