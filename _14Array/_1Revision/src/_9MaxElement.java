public class _9MaxElement {

    public static int maxElement(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int minElement(int[] arr) {
        int n = arr.length;
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int secondMax(int[] arr){
        int n = arr.length;
         int max = Integer.MIN_VALUE;
         int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) return -1;

        return secondMax;
    }

    public static int thirdMax(int[] arr){
        int n = arr.length;

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                third = second;
                second = max;
                max = arr[i];
            } else if (arr[i] > second && arr[i] < max) {
                third = second;
                second = arr[i];
            } else if (arr[i] > third && arr[i] < second) {
                third = arr[i];
            }
        }
        return third;
    }


    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 2, 3, 4};
        System.out.println("Max: " + maxElement(arr));
        System.out.println("Min: " + minElement(arr));
    }
}
