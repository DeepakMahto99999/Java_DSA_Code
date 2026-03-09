// Write a java program to input number from user and
// check number is palindrome or not using loop.


import java.util.Scanner;

public class _3Q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        int n = num;
        while (num > 0){
           int rem = num % 10;
           rev = rev * 10 + rem;
           num/=10;
        }
        if (n == rev) {
            System.out.println(n +" The number is palindrome. ");
        } else {
            System.out.println(n + " the number is not palindrome. ");
        }
    }
}
