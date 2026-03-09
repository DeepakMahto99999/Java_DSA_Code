public class Main {
    public static void main(String[] args) {
        int N = 33;
        int count = 0;
        for (int i = 1; i < N; i*=2) {
            count++;
        }
        System.out.println(count);
    }
}