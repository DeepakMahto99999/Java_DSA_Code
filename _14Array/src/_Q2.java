public class _Q2 {

    void MaxArray(){
        int[] array = {1,5,3,8,99};
        int max=0;
        for (int i = 0; i < array.length; i++) {
          if (array[i] > max){
              max =array[i];
          }
        }
        System.out.println(max);
    }



    public static void main(String[] args) {
        _Q2 obj = new _Q2();
        obj.MaxArray();
    }
}
