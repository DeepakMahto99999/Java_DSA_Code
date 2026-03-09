import java.util.*;
import java.lang.*;

public class Q4
{
    // Function to generate Special Triangle.
    public static void printTriangle(int[] A)
    {
        int n = A.length;
        if (n < 1) return;

        // Creating new array which contains the
        // Sum of consecutive elements in
        // the array passes as parameter.

        int[] temp = new int[n - 1];

        for (int i = 0; i < n - 1; i++)  {
            int x = A[i] + A[i + 1];
            temp[i] = x;
        }
        // Make a recursive call and pass
        // the newly created array
        printTriangle(temp);

        // Print current array in the end so
        // that smaller arrays are printed first
        System.out.println(Arrays.toString(A));
    }

    public static void main(String[] args){
        int[] A = { 1, 2, 3, 4, 5 };
        printTriangle(A);
    }
}