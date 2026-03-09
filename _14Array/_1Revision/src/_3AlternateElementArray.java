public class _3AlternateElementArray {

    public static void alternativeElement(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i+=2) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        alternativeElement(arr);
    }


}
