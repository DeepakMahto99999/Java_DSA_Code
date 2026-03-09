// Given a String, write a method to print all its subsequences.

public class Q1 {

    static void subsequences(String s , String currAns){

        if(s.length()==0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0); // a
        String remString = s.substring(1); //bc

        // curr char -> chooses to be a part of currAns
         subsequences(remString,currAns + curr); // bc , a

        // curr char -> does not choose to be a part of currAns
        subsequences(remString ,currAns); // bc ,""
    }

    public static void main(String[] args) {
        String s = "abc";
        subsequences(s,"");
    }
}
