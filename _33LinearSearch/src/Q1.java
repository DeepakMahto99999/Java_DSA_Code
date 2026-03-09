
public class Q1 {

    static int lastIndex(int[] arr ,int n , int target,int idx){
        if(idx < 0 ) return -1;

        if(arr[idx] == target) return idx;

        return lastIndex(arr,n,target,idx-1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 5, 3, 4};
        int target = 3;
        int n = arr.length;

        System.out.println(lastIndex(arr,n,target,n-1));

    }
}

