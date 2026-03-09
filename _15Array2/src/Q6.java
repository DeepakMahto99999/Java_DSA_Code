public class Q6 {

    static int[] findSmallestAndLargest(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];

        for (int num : arr) {
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        int[] result = findSmallestAndLargest(arr);

        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
    }
}
