// Given two strings s and t of lengths m and n respectively,
// return the minimum window substring  of s such that every character
// in t (including duplicates) is  included in the window.
// If there is no such substring, return the empty string "".

// The testcases will be generated such that the answer is unique.
// Example 1:
// Input: s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"
// Explanation: The minimum window substring "BANC" includes 'A', 'B',
// and 'C' from string t.


// logic
// Use hashmap to track characters of t.
// Expand window to the right until all characters are found.
// Then shrink window from the left to minimize it.
// Update the best result while doing this.
// map(ch)  ---> v
// v == 0 window has same no of ch as, present in the t string perfect window
// v < 0 window has more no of ch as, present in the t string ->shrinking
// v > 0 window has less no of ch as ,present in the string  -> Expansion


import java.util.HashMap;
public class minimumWindowSubstring {

    public static String minWindow(String s, String t) {
     HashMap<Character,Integer> freqMap = new HashMap<>();

     // populate the map with t string
     // T -> M
     // S -> N
        for (int i = 0; i < t.length() ; i++) {
            char ch = t.charAt(i);
            freqMap.put(ch ,freqMap.getOrDefault(ch,0)+1);
        }


        int uniqueCharCount = freqMap.size();

        int startIndex = -1;
        int windowStart = 0;
        int windowEnd = 0;
        int minLen = Integer.MAX_VALUE;
        int N = s.length();

        while (windowEnd < N){
            // Expansion Phase
            char ch = s.charAt(windowEnd);
            if(freqMap.containsKey(ch)){
              freqMap.put(ch ,freqMap.get(ch)-1);
              if(freqMap.get(ch) == 0){
                  uniqueCharCount--;
              }
            }

            // Shrinking phase
            while (uniqueCharCount == 0){
                // find length
                int len = windowEnd - windowStart + 1;
                if(len < minLen){
                    minLen = len;
                    startIndex = windowStart;
                }
                ch = s.charAt(windowStart);
                if(freqMap.containsKey(ch)){
                    freqMap.put(ch ,freqMap.get(ch)+1);
                    if(freqMap.get(ch) > 0){
                        uniqueCharCount++;
                    }
                }
                windowStart++;
            }

            windowEnd++;
        }

        if (startIndex == -1){
            return "";
        }
        return s.substring(startIndex,startIndex+minLen);

    }

    public static void main(String[] args) {
     String s = "ADOBECODEBANC";
     String t = "ABC";
      System.out.println(minWindow(s,t));

    }

}
