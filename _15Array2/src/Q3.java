// the first occurrence of element x

public class Q3 {
    static int firstOccurrences(int[] arr , int x){
        int lastIndex=-1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]){
                lastIndex=i;
                break;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
        int[] arr = {50,6,5,3,5,4};
        int x =5;

        System.out.println("last occurrences of element x is" +
                " :"+firstOccurrences(arr,x));
    }
}

