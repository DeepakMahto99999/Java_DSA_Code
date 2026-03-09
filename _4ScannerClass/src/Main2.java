import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String st = sc.nextLine();
//        System.out.println("output is :" +st );

        String sampleText =
                " I love Java!\n"
                        + " You love Java!\n"
                        + " User input with Java is so easy!\n"
                        + " Just use the Scanner class.\n";

        Scanner scanner = new Scanner(sampleText);

        // Skip first three lines
        for (int i = 1; i < 2; i++) {
            scanner.nextLine();
        }

        // Now read the fourth line
        System.out.println("Fourth line: " + scanner.nextLine());

        scanner.close();

    }
}