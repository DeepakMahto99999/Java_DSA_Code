public class Main3 {

    public static int[] deleteElement(int[] arr , int idx){

        if (idx < 0 || idx >= arr.length ){
            throw  new IllegalArgumentException("Invalid position");
        }

        int[] newArr = new int[arr.length-1];

        for (int i =0; i < idx; i++){
            newArr[i] = arr[i];
        }

        for (int i = idx+1; i < arr.length ; i++) {
            newArr[i-1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int idx = 2;

        int[] newArr = deleteElement(arr , idx);

        System.out.println("Array after delete: ");

        for (int num : newArr){
            System.out.print(num+" ");
        }
    }
}
