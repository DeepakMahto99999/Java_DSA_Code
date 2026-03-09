import java.util.Scanner;

public class PyramidOfSameNumber {
    public static void main(String[] args) {
        //          1
        //        2    2
        //       3      3
        //      4 4 4 4 4 4

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(); // Number of rows for the pyramid

        for (int i = 1; i <= r; i++) {
            // Print leading spaces before the first number
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }

            if (i == r) {
                // Print the entire row of the last line
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(i);
                }
            } else {
                // Print the first number
                System.out.print(i);

                // Print spaces between numbers for rows above the last line
                if (i > 1) {
                    for (int k = 1; k <= (2 * i - 3); k++) {
                        System.out.print(" ");
                    }
                    // Print the second number
                    System.out.print(i);
                }
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
