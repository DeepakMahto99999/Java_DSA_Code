// Calculate the minimum element in the array
// {2, -3, 5, 8, 1, 0, -4} using standard library method
// for calculating the minimum element.


import java.util.Arrays;

public class Q10 {

//    static void array(int arr[]){
//       Arrays.sort(arr);
//       System.out.println(arr[0]);
//    }
//
    public static void main(String[] args) {
        int[] arr ={2, -3, 5, 8, 1, 0, 84};
//         array(arr);
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
