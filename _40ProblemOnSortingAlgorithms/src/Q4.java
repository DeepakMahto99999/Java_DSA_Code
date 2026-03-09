// Given a string s, return the string which contains all
// characters of s in lexicographical order

// input :- coding
// output :- cdgino
// input :-  abcde
// output :- abcde



public class Q4 {

    static String sorting(String s){
        int n = s.length();

        char[] arr = s.toCharArray();

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
             if(Character.compare(arr[j] , arr[j+1]) > 0){
                 char temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "coding";
        System.out.println(sorting(s));
    }
}
