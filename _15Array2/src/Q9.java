// Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
//strings stored on odd indices of the array.

public class Q9 {
    public static void main(String[] args) {
        String[] arr = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};

        // Loop through the array and print strings at odd indices
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                System.out.println(arr[i]);
            }
        }
    }
}
