import java.util.HashMap;
import java.util.HashSet;

public class _2IsomorphicStrings {

    static boolean isIsomorphic(String s , String t){

        HashMap<Character,Character> mp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);

            if (mp.containsKey(sCh)){
                if (mp.get(sCh) != tCh) return false;
            }
            // "ab", "aa" {a → a} , b -- xx a
            else if (mp.containsValue(tCh)) {
                return false;
            }else {
                mp.put(sCh,tCh);
            }
        }
        return true;
    }

    static boolean isIsomorphic2(String s , String t){

        HashMap<Character,Character> mp = new HashMap<>();
        HashSet<Character> st = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            Character sCh = s.charAt(i);
            Character tCh = t.charAt(i);

            if (mp.containsKey(sCh)){
                if (mp.get(sCh) != tCh) return false;
            }

            // "ab", "aa" {a → a} , b -- xx a
            else if (st.add(tCh)) {
                return false;
            } else {
                mp.put(sCh,tCh);
                st.add(tCh);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper", "title"));
    }
}
