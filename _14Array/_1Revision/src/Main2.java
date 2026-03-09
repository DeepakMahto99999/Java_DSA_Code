public class Main2 {

    public static int[] insertElement(int[] arr , int pos , int val){
        if(pos < 0 || pos > arr.length){
            throw new IllegalArgumentException("Invalid position!");
        }

        int[] newArr = new int[arr.length+1];

        for (int i = 0; i < pos; i++) {
            newArr[i] = arr[i];
        }

        newArr[pos] = val;

        for (int i = pos; i < arr.length; i++) {
            newArr[i+1] = arr[i];
        }

        return newArr;

    }


    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        int element = 25;
        int position = 2;

        int[] newArr = insertElement(arr , position , element);

        System.out.println("Array After insertion:  ");
        for(int num: newArr){
            System.out.print(num+ " ");
        }
    }
}
