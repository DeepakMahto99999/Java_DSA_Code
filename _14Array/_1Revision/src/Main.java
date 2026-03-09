import java.util.HashSet;

public class Main {

   // Method to perform linear search
   public static int linearSearch(int[] arr , int key ){
       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == key) {
               return i;
           }
       }
       return -1;
   }


   public static void countDuplicateUnique(int[] arr){
       int n  = arr.length;
       int countUnique = 0;
       int countDuplicate = 0;

       boolean[] isVisited = new boolean[n];

       for (int i = 0; i < n; i++) {
           if (isVisited[i]) continue;

           int freq = 1;
           for (int j = i+1; j < n ; j++) {
               if (arr[i] == arr[j]){
                   freq++;
                   isVisited[j] = true;
               }
           }

           if (freq ==1) countUnique++;
           else countDuplicate++;
       }

       System.out.println("the unique number is : " + countUnique);
       System.out.println("the duplicate number is : " + countDuplicate);

   }

   public static void countDU(int[] arr){

       int countU = 0;
       int countD = 0;

       int n = arr.length;
       int i =0;

       while (i < n){
           int freq = 1;
           int j = i+1;
           while (j < n && arr[i] == arr[j]){
               j++;
           }
           freq = j -i;
           if (freq == 1){
               countU++;
           }else {
               countD++;
           }
         i = j;
       }
   }



    public static void main(String[] args) {
        // Declare and initialize array
        int[] arr = {10, 20, 30, 40, 50};
        // Element to search
        int key = 30;
        // Call linear search method
        int result = linearSearch(arr, key);
        // Print results
        if (result == -1) {
            System.out.println("Element " + key + " not found in array.");
        } else {
            System.out.println("Element " + key + " found at index: " + result);
        }
    }

}
