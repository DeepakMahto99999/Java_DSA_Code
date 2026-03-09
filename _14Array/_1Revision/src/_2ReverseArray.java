import java.util.*;

/**
 * Demonstrates multiple ways to reverse an array in Java.
 */
public class _2ReverseArray {

    /**
     * Method 1: Print array in reverse order (without modifying it).
     */
    public static void reverseArray1(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Method 2: Reverse array in-place using two pointers (modifies original array).
     */
    public static void reverseArray2(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            // swap elements
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        // Print the modified array
        System.out.println(Arrays.toString(arr));
    }

    /**
     * Method 3: Create a new reversed array (original array remains unchanged).
     */
    public static void reverseArray3(int[] arr) {
        int n = arr.length;
        int[] rev = new int[n];

        for (int i = 0; i < n; i++) {
            rev[i] = arr[n - 1 - i];
        }

        System.out.println(Arrays.toString(rev));
    }

    /**
     * Method 4: Use Collections.reverse() (works only with Integer[], not int[]).
     */
    public static void reverseArray4(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        // Example 1: int[] array
        int[] arr = {1, 2, 3, 4};

        System.out.println("Method 1 (Print Reverse Only):");
        reverseArray1(arr); // Output: 4 3 2 1

        System.out.println("Method 2 (In-Place Reverse):");
        reverseArray2(arr); // Output: [4, 3, 2, 1]

        System.out.println("Method 3 (New Reversed Array):");
        reverseArray3(arr); // Output: [1, 2, 3, 4] (depending on arr’s current state)

        // Example 2: Integer[] array for Collections.reverse
        Integer[] arr2 = {1, 2, 3, 4};
        System.out.println("Method 4 (Collections.reverse):");
        reverseArray4(arr2); // Output: [4, 3, 2, 1]
    }
}



// 1. Difference between int[] and Integer[]
// int[] → an array of primitive int values
// Example: [1, 2, 3, 4]
// Integer[] → an array of objects (Integer wrappers)
// Example: [Integer(1), Integer(2), Integer(3), Integer(4)]
// Java’s Collections Framework (List, Collections.reverse, etc.) only works with objects, not primitives.


// int[] arr = {1, 2, 3, 4};
// List<int[]> list = Arrays.asList(arr);

// System.out.println(list);

// Output:
// [[I@6d06d69c]


// Why?
// asList thinks arr is just one object (int[]) instead of elements.
// So you get a List<int[]> with size 1, where the only element is the entire primitive array.
// It does not “unpack” the int values into separate elements.


//🔹 3. Why is that?
// Arrays.asList(T... a) is a varargs method that expects object references (T).
// But int is not an object — it’s primitive.
// So when you pass int[], Java treats it as a single object of type int[], not as a sequence of ints.
// That’s why Collections.reverse(list) won’t work properly with int[].

















