// Java Program to reverse each word in String
// Input - I am an educator
// Output - I ma na rotacude

import java.util.ArrayList;
import java.util.Arrays;

public class Q5 {

    static String reverse(String s) {
        StringBuilder g = new StringBuilder(s);
        int i = 0, j = s.length() - 1;

        while (i < j) {
            char temp = g.charAt(i);
            g.setCharAt(i, g.charAt(j));
            g.setCharAt(j, temp);
            i++;
            j--;
        }

        return g.toString(); // Returning the reversed string
    }


    static void reverseWord(String s) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));

        for (int i = 0; i < words.size(); i++) {
            words.set(i, reverse(words.get(i))); // Reverse each word and update the list
        }

        System.out.println(String.join(" ", words)); // Join the words back into a sentence
    }

    public static void main(String[] args) {
     String s = "I am an educator.";
     reverseWord(s);
    }
}
