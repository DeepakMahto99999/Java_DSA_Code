import java.util.HashSet;

public class _2LongestConsecutiveElement {

    static int longestConsecutive(int[] arr){
        int maxLen = 0;

        HashSet<Integer> st = new HashSet<>();

        for(int num : arr) st.add(num);


       for (int num : st ){
           if(!st.contains(num - 1)){ // num is starting point of a sequence
               int currNum = num;
               int currStreak = 1; // length of current consecutive sequence
               while (st.contains(currNum+1)){
                   currStreak++;
                   currNum++;
               }
               maxLen = Math.max(maxLen,currStreak);
           }
       }

        return maxLen;
    }

    public static void main(String[] args) {
      int[] arr = {99,1,100,4,200,1,2,2,3};
        System.out.println(longestConsecutive(arr));
    }
}
