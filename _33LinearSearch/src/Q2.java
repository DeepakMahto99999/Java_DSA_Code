// Implement is sorted method

public class Q2 {
    static boolean isArraySorted(int[] arr,int n,int idx){
        if(idx == n) return true;

        if(arr[idx] < arr[idx -1]) return false;

        return isArraySorted(arr,n,idx+1);
    }

    public static void main(String[] args) {
    int[] arr = {1,2,3,4,5};

    int n = arr.length;

  if(isArraySorted(arr,n,1)){
      System.out.println("sorted");
  } else{
      System.out.println("not sorted");
  }

//    boolean isSorted = true;
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] < arr[i-1]){
//              isSorted = false;
//              break;
//            }
//        }
//        if(isSorted){
//            System.out.println("sorted array");
//        } else{
//            System.out.println("not sorted");
//        }
    }
}
