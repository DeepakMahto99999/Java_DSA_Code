public class _12InverseOfMatrix {

    // Function to calculate inverse using Gauss-Jordan
    public static double[][] inverse(double[][] A) {
        int n = A.length;

        // Augmented matrix [A | I]
        double[][] aug = new double[n][2 * n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                aug[i][j] = A[i][j];
            }
            aug[i][i + n] = 1; // identity matrix part
        }

        // Gauss-Jordan elimination
        for (int i = 0; i < n; i++) {
            // 1. Pivoting: if pivot is 0, swap with a lower row
            if (aug[i][i] == 0) {
                boolean swapped = false;
                for (int j = i + 1; j < n; j++) {
                    if (aug[j][i] != 0) {
                        double[] temp = aug[i];
                        aug[i] = aug[j];
                        aug[j] = temp;
                        swapped = true;
                        break;
                    }
                }
                if (!swapped) {
                    throw new ArithmeticException("Matrix is singular, no inverse exists");
                }
            }

            // 2. Scale row so pivot = 1
            double pivot = aug[i][i];
            for (int j = 0; j < 2 * n; j++) {
                aug[i][j] /= pivot;
            }

            // 3. Eliminate other rows
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = aug[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        aug[k][j] -= factor * aug[i][j];
                    }
                }
            }
        }

        // Extract inverse from augmented matrix
        double[][] inv = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                inv[i][j] = aug[i][j + n];
            }
        }
        return inv;
    }

    // Utility function to print matrix
    public static void printMatrix(double[][] M) {
        for (double[] row : M) {
            for (double val : row) {
                System.out.printf("%8.3f ", val);
            }
            System.out.println();
        }
    }

    // Main
    public static void main(String[] args) {
        double[][] A = {
                {2, 1},
                {5, 3}
        };

        System.out.println("Original Matrix:");
        printMatrix(A);

        try {
            double[][] inv = inverse(A);
            System.out.println("\nInverse Matrix:");
            printMatrix(inv);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
