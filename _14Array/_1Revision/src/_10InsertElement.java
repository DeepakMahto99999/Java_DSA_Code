public class _10InsertElement {

    public static int[] insertElement(int[] arr , int position , int ele){
        int n = arr.length;
        int[] newArr = new int[n+1];

        for (int i = 0; i < position-1; i++) {
            newArr[i] = arr[i];
        }

        newArr[position-1] = ele;

        for (int i = position; i <=n ; i++) {
            newArr[i] = arr[i-1];
        }


        return newArr;
    }

    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       int position = 3;
       int element = 8;

       int[] ans = insertElement(arr , position,element);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
