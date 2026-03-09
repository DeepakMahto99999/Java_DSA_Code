// Given an array of size N containing only 0s, 1s , and 2s;
// sort the array in ascending order.
// N =6
// arr[] = {0, 2 ,1,2, 0,0}
// output: 0 0 0 1 2 2


public class Q3{

    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void sort012(int[] arr){
        int n = arr.length;
        
        int count0 = 0 , count1 = 0 , count2 =0;

       for(int i = 0; i < n; i++) {
           if(arr[i] == 0){
               count0++; 
           } else if (arr[i] == 1) {
               count1++;
           } else {
               count2++;
           }
       }
       int k =0;
           while (count0 > 0){
               arr[k++] = 0;
               count0--;
           }
           while (count1 > 0){
               arr[k++] = 1;
               count1--;
           }
           while (count2 > 0) {
               arr[k++] = 2;
               count2--;
           }


       
   }


     static void Sort012(int[] a){
        int lo = 0 , mid =0 , hi = a.length-1;

        // explore the unknown region
         while (mid <= hi){
             if(a[mid] == 0){
                 swap(a, mid ,lo);
                 mid++;
                 lo++;
             } else if(a[mid] == 1) {
               mid++;
             } else {
                 swap(a ,mid ,hi);
                 hi--;
             }
         }
     }
    
    public static void main(String[] args) {
     int[] arr = {0, 2 ,2,1,2,0,0,1,2, 0,0};
     sort012(arr);
     Sort012(arr);
     displayArr(arr);
    }
}
