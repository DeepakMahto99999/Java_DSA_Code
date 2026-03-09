// Write a  program to input vowels and print any word
// starting from that letter using switch case.
//You can print any word, provided the starting letter
// should be the input as provided by the user.
//Assumption: all inputs are in lower case.

import java.util.Scanner;

public class _42Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter a vowel
        System.out.print("Enter a vowel (a, e, i, o, u): ");
        char vowel = sc.next().charAt(0);

        // Use switch case to print words based on the input vowel
        switch (vowel) {
            case 'a':
                System.out.println("Apple");
                break;
            case 'e':
                System.out.println("Elephant");
                break;
            case 'i':
                System.out.println("Ice cream");
                break;
            case 'o':
                System.out.println("Orange");
                break;
            case 'u':
                System.out.println("Umbrella");
                break;
            default:
                System.out.println("Invalid input! Please enter a vowel (a, e, i, o, u).");
        }

        sc.close(); // Close the scanner
    }
}
