
// Write a java program to check whether a
// character is alphabet, digit or special character.

import java.util.Scanner;

class _7Q {
    public static void main(String[] args) {
        System.out.println("Enter any input:");
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

            // Check digit
        if (input >= 48 && input <= 57)
            System.out.println("Digit ");

        // check small and capital letters.
        else if ((input >= 65 && input <= 90)
                || (input >= 97 && input <= 122))
            System.out.println("Alphabet ");

            // Else Special character
        else
            System.out.println("Special Character ");
    }
}
