class Algebra {
    int add(int a, int b) {
        // Modify a and b inside the method
        a = a + 10;
        b = b + 20;
        System.out.println("Inside method: a = " + a + ", b = " + b);
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        int x = 5;
        int y = 7;

        System.out.println("Before method call: x = " + x + ", y = " + y);

        int result = obj.add(x, y);

        System.out.println("After method call: x = " + x + ", y = " + y);
        System.out.println("Result: " + result);
    }
}

//Before method call: x = 5, y = 7
//Inside method: a = 15, b = 27
//After method call: x = 5, y = 7
//Result: 42

