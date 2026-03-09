public class RadixSortDecreasing {

    static void displayArr(int[] arr){
        for (int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    static void countSort(int[] arr , int place){
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        for(int i = 0; i < n; i++){
            count[(arr[i]/place)%10]++;  // Count the occurrence of digits at the current place
        }

        for(int i = count.length -2; i >=0; i--){
            count[i] += count[i+1];
        }

        for(int i = n-1; i >=0; i--){
            int idx = count[(arr[i]/place)%10]-1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSort(int[] arr ){
        int max = findMax(arr);

        for(int place = 1; max/place > 0; place *=10) {
            countSort(arr , place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,43,6,3,1};
        radixSort(arr);
        displayArr(arr);
    }
}
