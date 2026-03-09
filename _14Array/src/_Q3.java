public class _Q3 {

    public int Search(){
        int x =5;
        int[] arr = {1,3,5,8,5};
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        _Q3 obj = new _Q3();
        System.out.println(obj.Search());
    }
}
