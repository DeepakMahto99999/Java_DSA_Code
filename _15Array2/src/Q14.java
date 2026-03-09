public class Q14 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4,8, 5};
        int[] b = {1, 2,23, 6};

        for (int i = 0; i < b.length; i++) {
            boolean check = false;
            for (int j = 0; j < a.length; j++) {
                if (b[i] == a[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println(b[i]);
            }
        }
    }
}

