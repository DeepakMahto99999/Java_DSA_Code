class Q3 {
    public static int paths(int i, int j, int m, int n) {
        // Base case: If out of bounds, return 0
        if (i > m || j > n) {
            return 0;
        }
        // Base case: If reached the destination, return 1
        if (i == m && j == n) {
            return 1;
        }

        // Move right (i, j+1) and move down (i+1, j)
        return paths(i, j + 1, m, n) + paths(i + 1, j, m, n);
    }

    public static void main(String[] args) {
        System.out.println(paths(0, 0, 2, 2)); // Expected output: 2
    }
}
