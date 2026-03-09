// Find the unique number in a given Array where all element are
// being repeated twice with one value being unique

public class _3Q {

    static int uniqueElement(int[] arr){
        int ans=-1;
        for(int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                   ans =arr[i];
                }
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,1,3};
        System.out.println(uniqueElement(arr));
    }
}
