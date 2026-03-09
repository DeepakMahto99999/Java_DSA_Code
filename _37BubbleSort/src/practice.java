
public class practice {

    public static void main(String[] args) {
        int[] arr = {2,1,0,23,2,1,3,7};

        int n = arr.length;

        for (int i = 0; i < n-1 ; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}