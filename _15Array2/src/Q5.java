// Check if the given array is sorted or not

public class Q5 {

  static boolean isSorted(int[] arr){
      boolean check =true;

      for (int i = 1; i < arr.length; i++) {
          if(arr[i] < arr[i-1]){
              //not sorted
              check =false;
              break;
          }
      }
      return check;
  }


    public static void main(String[] args) {
        int arr[] = {1,2,3,3,5,8};
        System.out.println("Is array sorted :"+isSorted(arr));
    }
}
