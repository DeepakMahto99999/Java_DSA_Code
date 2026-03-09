// Given two number x and y final product using recursion

public class Q4 {

    static int product(int x, int y) {
        // Base case: if y is 0, the product is 0
        if (y == 0) {
            return 0;
        }
        // If y is negative, handle it by flipping the sign
        if (y < 0) {
            return -product(x, -y);
        }

        // Recursive case: x + product(x, y - 1)
        return x + product(x, y - 1);
    }

    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        System.out.println("Product: " + product(x, y));
    }
}

