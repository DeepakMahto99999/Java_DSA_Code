
public class CountSort {

  static void displayArr(int[] arr){
      for (int val : arr){
          System.out.print(val + " ");
      }
      System.out.println();
  }

  static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
              max = arr[i];
            }
        }
        return max;
    }

  static void basicCountSort(int[] arr){
    // find the largest element of the array
      int max = findMax(arr);
      int[] count = new int[max + 1];

      for(int i = 0; i < arr.length; i++) {
          count[arr[i]]++;
      }

      int k =0;
      for (int i = 0; i < count.length; i++) {
          for (int j = 0; j < count[i]; j++) {
              arr[k++] =i;
          }
      }
  }

 static void countSort(int[] arr){
      int n = arr.length;
      int[] output = new int[n];

     // find the largest element of the array
      int max = findMax(arr);
      int[] count = new int[max + 1];
      for(int i = 0; i < n; i++) { // Make frequency array --> Tc -> n
         count[arr[i]]++;
     }

      // it will specify the value of arr will be in which index
     // Make prefix sum array of Count array
     for (int i = 1; i < count.length; i++) {  // TC -> max
         count[i] += count[i-1];
     }

     // Find the index each element in the original array and put in output array
     for(int i = n-1; i >=0 ; i--) { // TC -> n
         int idx = count[arr[i]]-1;
         output[idx] = arr[i];
         count[arr[i]]--;
     }

     // copy all element of output to arr
     for (int i = 0; i < n; i++) {  // TC --> n
         arr[i] = output[i];
     }
 }

    public static void main(String[] args) {
        int[] arr = {1,6,5,3,2,4};
        basicCountSort(arr);
        displayArr(arr);
    }
}
