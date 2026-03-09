public class _Q1 {

    void SumOfArray(){
        int[] arr = {1,5,3};
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }

        System.out.println("The sum of array is "+sum);


    }

    public static void main(String[] args) {
       _Q1 obj = new _Q1();
       obj.SumOfArray();
    }
}