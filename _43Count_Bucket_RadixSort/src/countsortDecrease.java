

public class countsortDecrease {

    static void printArr(int[] arr){
        int n = arr.length;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max ){
                max = arr[i];
            }
        }

        return max;

    }

    static void countSort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];

        int max = findMax(arr);

        int[] count = new int[max +1];

        for(int i = 0; i < n; i++) {
            count[arr[i]]++;
        }

        int l = count.length;

        for(int i =l-2; i >= 0; i-- ){
            count[i] += count[i+1];
        }

        for(int i = n-1; i >=0 ; i--) {
            int idx = count[arr[i]]-1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < n; i++) {  // TC --> n
            arr[i] = output[i];
        }


    }

    public static void main(String[] args) {
        int[] arr = {20,43,56,23,45};
        countSort(arr);
        printArr(arr);
    }
}
