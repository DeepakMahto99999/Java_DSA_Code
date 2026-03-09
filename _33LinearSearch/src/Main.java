 // given an array of n integer and a target value x.
 // Print whether x exists in the array or not.

 import java.util.ArrayList;
 import java.util.Arrays;

 public class Main {

    // return yes if target present in array , otherwise return no
    static boolean search(int[] arr ,int n, int target ,int idx){
        // base case
        if(idx >= n)  return false;
        // self work
        if(arr[idx] ==target) return true;
        //recursive work
        return search(arr,n,target,idx+1);

    }

    // return index of index if target present in array , otherwise return -1
    static int searchIndex(int[] arr, int n, int target , int idx){
        // base case
        if(idx >=n) return -1;
        // self work
        if(arr[idx] ==target) return idx;
        // recursive work
        return searchIndex(arr,n,target,idx+1);
    }

    // return all indices in arr
     static void searchIndices(int[] arr, int n, int target , int idx){
        // base case
         if(idx >= n){
             return;
         }
         //self work
          if(arr[idx]== target){
              System.out.print(idx + " ");
          }
         //recursive work
         searchIndices( arr,  n, target ,  idx+1);
     }

      static ArrayList<Integer> allIndices(int[] arr , int n ,int target
              , int idx){
          ArrayList<Integer> ans = new ArrayList<>();

         // base case
          if(idx >=n){
             return ans;
          }

          // self work
          if(arr[idx] ==target){
              ans.add(idx);
          }

          // recursive work
          ArrayList<Integer> smallAns = allIndices(arr,n,target ,idx+1);

          ans.addAll(smallAns);
          return ans;
     }

     public static void main(String[] args) {
        int[] arr = {4,2,4,3,2,4,4,5,4};
        int target =4;
        int n =arr.length;

//        if(search(arr ,n,target ,0)){
//            System.out.println("yes");
//        } else{
//            System.out.println("No");
//        }

//         System.out.println(searchIndex(arr,n,target,0));

//      searchIndices(arr,n,target,0);

         ArrayList<Integer> ans = allIndices(arr,n,target,0);
         for(Integer i : ans){
             System.out.println(i);
         }
         }
     }
