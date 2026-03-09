// Sort an array consisting of only 0s and 1s

public class _1Q {

  static void sortZeroesAndOnes(int[] arr){
       int n =arr.length;
       int zeroes =0;
       for (int i = 0; i < n; i++) {
          if(arr[i]==0){
          zeroes++;
          }
      }

      // 0 to zeroes-1 : 0, zeroes to n-1:1
      for (int i = 0; i < n; i++) {
          if(i < zeroes){
              arr[i] =0;
          } else{
              arr[i]=1;
          }
          System.out.println("sorted array "+arr[i]);
      }

  }

    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 0, 1};
        sortZeroesAndOnes(arr);
    }
}