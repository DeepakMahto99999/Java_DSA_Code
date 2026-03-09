import java.util.Arrays;

public class _4OddEvenArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

         int evenCount =0;
         int oddCount = 0;
         for(int num: arr){
            if(num % 2 == 0) evenCount++;
            else oddCount++;
         }

         int[] odd = new int[oddCount];
         int[] even = new int[evenCount];

         int oi =0 , ei =0;
         for(int num: arr){
             if(num % 2 == 0) even[ei++] = num;
             else odd[oi++] = num;
         }

        System.out.println("odd Array: " + Arrays.toString(odd));
        System.out.println("Even Array: " + Arrays.toString(even));


    }
}
