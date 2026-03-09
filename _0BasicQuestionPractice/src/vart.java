public class vart {
    // Instance variable
    int instanceVar = 10;

    // Constructor
    public vart() {
        System.out.println("Constructor: Instance variable = " + instanceVar);
        int localVar = 20;  // Modify instance variable in constructor
        System.out.println("constructor2: localvariable = " +localVar);
    }

    // Instance method
    public void myMethod() {
        System.out.println("Method: Instance variable = " + instanceVar);
        instanceVar = 30;  // Modify instance variable in method

    }

    public static void main(String[] args) {
        vart obj = new vart();
        obj.myMethod();  // Access and modify instanceVar
        System.out.println("Main: Instance variable = " + obj.instanceVar);// Access instanceVar in main

    }
}
