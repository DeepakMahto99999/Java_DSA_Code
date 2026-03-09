// Given an array of strings arr[]. Sort given strings using
// Bubble Sort and display the sorted
// n = 3
//arr[] = [coding, is, fun]
// output: Coding fun is


public class Q3 {

    static void sorting(String[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (arr[j].compareTo(arr[j+1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {"coding", "is","fun"};
        sorting(arr);
        for (String val : arr){
            System.out.print(val + " ");
        }
    }
}
