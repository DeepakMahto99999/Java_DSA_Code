// Write a program to print all natural numbers from n to 1
// using recursion


import java.util.Scanner;

public class Q1 {
    static void printDcreasing(int n) { // 1 ,2 , .... n-1 , n
        // base case
        if(n == 1){
            System.out.println(n);
            return;
        }

        // self work
        System.out.println(n);

        // recursive work
        printDcreasing(n-1); // 1 ,2 ,... n-1

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDcreasing(n);
    }
}
