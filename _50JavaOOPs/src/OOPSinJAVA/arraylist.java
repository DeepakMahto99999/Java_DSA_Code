package OOPSinJAVA;

import java.util.ArrayList;
import java.util.Arrays;

public class arraylist {

    public static class Arraylist{
        int[] arr = new int[5];
        int idx = 0;
        int size =0;

        public void add(int ele){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr,arr.length*2);
                arr = brr;
            }
            arr[idx] = ele;
            idx++;
            size++;
        }

        public void set(int idx , int val){
            arr[idx] = val;
        }
    }

    public static void main(String[] args) {
        Arraylist arr = new Arraylist();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size);
        arr.add(5);
        System.out.println(arr.size);
        arr.set(0,10);
    }
}
