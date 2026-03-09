public class _3Q {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; ++i) {
            System.out.println("Washing dish number " + i);
            if (i == 3) {
                break; // Stop washing dishes after the 3rd one
            }
        }
        System.out.println("Done with the dishes (outside the loop).\n");

        for (int i = 1; i <= 5; ++i) {
            if (i == 2 || i == 4) {
                continue; // Skip washing dishes number 2 and 4
            }
            System.out.println("Washing dish number " + i);
        }
        System.out.println("Done with the dishes (outside the loop).");
    }
}
