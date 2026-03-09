// Given an integer array , move all 0's to the end of it while
// maintaining the relative order of the non-zero elements


public class Main {

    static void moveZerosToEnd(int[] num){
        int nonZeroIndex = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < num.length; i++) {
            if (num[i] != 0) {
                num[nonZeroIndex] = num[i];
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeros
        while (nonZeroIndex < num.length) {
            num[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }

    public static void main(String[] args) {
        int[] num = {0, 5, 0, 3, 4,2};
        moveZerosToEnd(num);
        // Print the result
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}