import java.util.Arrays;

public class Q7 {

     int[] findSmallestAndLargest(int[] arr) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};

        Q7 obj = new Q7();
        int[] ans =  obj.findSmallestAndLargest(arr);

//        int[] ans =findSmallestAndLargest(arr);
        System.out.println("Smallest: "+ ans[0]);
        System.out.println("largest: "+ ans[1]);

    }
}
