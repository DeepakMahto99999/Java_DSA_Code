// Given a string, the task is to toggle all the characters of the string
// i.e to convert Upper case to Lower case and vice versa
// input: - PhysICs
// output:- pHYSics
// ASIIC value
// A - 65 a -97 0-48


import java.util.Scanner;

public class Q1 {

    static void toggle(StringBuilder str){
        for (int i = 0; i < str.length(); i++) {

            // check -> alphabet - small , capital
            boolean falg = true; // true -> capital
            char ch = str.charAt(i); // A

            if(ch==' ' ) continue;

            int asci = (int)ch; // 65
            if(asci >=97) falg = false;  // small

            if(falg == true){ // capital
                asci +=32;
                char dh = (char)asci; // a
                str.setCharAt(i,dh);


            } else  { //small
                asci -=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }
        }
    }

    static void Toggle(StringBuilder str){
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                // Convert uppercase to lowercase
                str.setCharAt(i, (char) (ch + 32));

            } else if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase
                str.setCharAt(i, (char) (ch - 32));
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
 //        toggle(str);
//        System.out.println(str);
        Toggle(str);
        System.out.println(str);
    }
}
