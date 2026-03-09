

public class Main {

     static void printArray(int[] arr, int idx) {

         if(idx == arr.length){
             return;
         }

         // self work
         System.out.println(arr[idx]);

         // recursive work - sub problem
         printArray(arr , idx+1);

    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8,9};
        printArray(arr ,0);
    }
}