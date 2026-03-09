public class Main {
    
    static void bubbleSort(int[] a){
        int n = a.length;
        
        // n-1 iteration/passes
        for (int i = 0; i < n-1; i++) {
            boolean flag = false; // has any swapping happened
            for (int j = 0; j < n-i-1; j++) {
                // last i element are already add at correct sorted position
                // so no need to check them
                if(a[j] > a[j+1]){
                    // swap - a[j] , a[j+1]
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
             return;
            }
       }
    }

    public static void main(String[] args) {
        int[] a = {7,6,5,4,3};
        bubbleSort(a);
        for (int i : a){
            System.out.print(i + " ");
        }
    }
}