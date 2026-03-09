
public class _11DeleteElement {

    public static int[] deleteXthPosition(int[] arr , int position){
        int n = arr.length;;
        int[] newArr = new int[n-1];

        for (int i = 0; i < position-1; i++) {
            newArr[i] = arr[i];
        }

        for (int i = position; i < n ; i++) {
            newArr[i-1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int deletePosition = 4;
        int[] ans = deleteXthPosition(arr,deletePosition);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
