import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static void printIncreasing(int n) { // 1 ,2 , .... n-1 , n
        // base case
        if(n == 1){
            System.out.println(n);
            return;
        }
        // recursive work
        printIncreasing(n-1); // 1 ,2 ,... n-1

        // self
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}