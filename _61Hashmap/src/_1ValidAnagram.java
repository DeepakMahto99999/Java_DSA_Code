// s = silent
// t = listen  both string are anagram so

import java.util.*;

public class _1ValidAnagram {

    static HashMap<Character,Integer> makeFreqMap(String str){
          HashMap<Character , Integer> mp = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,1);
            }else{
                int currFreq = mp.get(ch);
                mp.put(ch,currFreq+1);
            }
        }

          return mp;
    }

    static boolean areAnagrams(String s , String t){
        if (s.length() != t.length()) return false;

        HashMap<Character,Integer> mp1 =  makeFreqMap(s);
        HashMap<Character,Integer> mp2 =  makeFreqMap(s);

        return mp1.equals(mp2);

    }


    static boolean areAnagrams1(String s , String t){
        if (s.length() != t.length()) return false;

        HashMap<Character,Integer> mp1 =  makeFreqMap(s);

        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!mp1.containsKey(ch)) return false;

            int currFreq = mp1.get(ch);
            mp1.put(ch,currFreq-1);

            // if freq is 0 then remove from map
            if (mp1.get(ch) == 0) {
                mp1.remove(ch);
            }

        }

        // All values in mp should be 0 for s and t to be anagram
        return mp1.isEmpty();

    }

    public static void main(String[] args) {
        System.out.println(areAnagrams1("silernt", "listen"));
    }
}
