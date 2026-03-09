public class _2WhileloopQ {
    public static void main(String[] args) {
        // declare numberOfTimes variable.
        int numberOfTimes = 5;
         int sum =0;
        // code inside while loop will run infinite times.
        while(numberOfTimes>=1) {
//            System.out.println(numberOfTimes);
            sum += numberOfTimes;
//            System.out.println(sum);
//            System.out.println("Code inside while loop is running.");
            numberOfTimes--;
        }
        System.out.println(sum);
    }
}
