public class _43Q {
    public static void main(String[] args) {
        // Upper part of the pattern
        for (int i = 0; i < 4; i++) {
            // Printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < 7 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (int i = 2; i >= 0; i--) {
            // Printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < 7 - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
