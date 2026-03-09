// count the number is Strictly greater or not
public class Q4 {
    static int StrictlyGreater(int[] arr , int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {5,6,5,1,5};
        int x = 5;

        System.out.println("COUNT OF X: "+StrictlyGreater(arr , x));

    }
}
