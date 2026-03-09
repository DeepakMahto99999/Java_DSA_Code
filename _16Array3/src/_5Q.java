// Given an array "a" consisting of integer . return the first
// value that is repeating in this array. if no value is being
// repeated return -1.


public class _5Q {

    static int firstRepeatingNumber(int[] arr){
         int ans = -1;
        for(int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
//                  return arr[i];
                    ans =arr[i];
                }
            }
        }

      return ans;
    }


    public static void main(String[] args) {
        int[] arr = {1,5,3,4,6,3,4,6};
        System.out.println(firstRepeatingNumber(arr));
    }
}
