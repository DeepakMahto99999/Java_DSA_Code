public  class practice {

    static void displayArr(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr , int x ,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr , int st , int end){
        int pivot = arr[st];
        int count = 0;

        for (int i = st+1; i <=end ; i++) {
            if(arr[i] >= pivot) count++;
        }

        int pivotIdx = st + count;
        swap(arr,st,pivotIdx);

        int i = st , j = end;

        while (i < pivotIdx && j > pivotIdx){
            while (arr[i] >= pivot) i++;
            while (arr[j] < pivot) j--;
            if (i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }

    static void quickSort(int[] arr , int st , int end){
      if(st >= end) return;
      int pi = partition(arr , st , end);
      quickSort(arr,st , pi-1);
      quickSort(arr,pi+1,end);
    }


    public static void main(String[] args) {
        int[] arr = {7 ,13, 8, 5, 10, 2, 4};
        System.out.println("Array before sorting");
        displayArr(arr);
        quickSort(arr, 0 , arr.length-1);
        System.out.println("Array after sorting");
        displayArr(arr);
    }
}