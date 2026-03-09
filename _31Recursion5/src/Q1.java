import java.util.ArrayList;
import java.util.List;

public class Q1 {

    static public List<Integer> pattern(int N){
        List<Integer> result = new ArrayList<>();
        generatePattern(N, N, false, result);
        return result;
    }

    static void generatePattern(int curr, int ori, boolean increasing,
                                List<Integer> result){
        result.add(curr);

        if(curr <= 0){
            increasing = true;
        }

        if (increasing){
            if (curr == ori){
                return;
            }
            generatePattern(curr + 5, ori, true ,result);
        } else {
            generatePattern(curr - 5, ori, false ,result);
        }
    }

    public static void main(String[] args) {
        int n = 16;
        List<Integer> result = pattern(n);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
