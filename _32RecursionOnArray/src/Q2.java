
public class Q2 {

    static int sumArray(int[] arr, int idx){

        if(idx == arr.length){
            return 0;
        }

        return arr[idx] + sumArray(arr,idx+1);


    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,20,1};
        System.out.println(sumArray(arr,0));
    }
}
