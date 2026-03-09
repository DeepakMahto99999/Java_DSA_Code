// Given an array of positive and negative integers , segregate them
// in linear time and constant space. The output should print all
// negative numbers , followed by all positive numbers.
// Input: [19,-20,7,-4,-13,11,-5,3]
// Output: [-20 , -4 , -13 , -5 , 7,11 , 19 ,3]


import java.util.ArrayList;

public class Q2 {

    static void printArr(ArrayList<Integer> arr){
        for(int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    static ArrayList<Integer> sort(int[] arr){
        int n =arr.length;

        ArrayList<Integer> sorting = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            if(arr[i] < 0){
                sorting.add(arr[i]);
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] > 0){
                sorting.add(arr[i]);
            }
        }
        return sorting;
    }

    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void partition(int[] num){
        int l =0 , r = num.length-1;
        while (l < r){
            while(num[l] < 0) l++;
            while (num[r] >= 0) r--;
            if(l < r){
                int temp = num[l];
                num[l] = num[r];
                num[r] = temp;
                l++;
                r--;
            }
        }

    }

    public static void main(String[] args) {
     int[] arr = {19,-20,7,-4,-13,11,-5,3};
//        ArrayList<Integer> sortedArr = sort(arr);
//        printArr(sortedArr);
        partition(arr);
        displayArr(arr);

    }
}
