// koi bhi celebrity tab hai jab usko sab janta hai but wo kisko nhi janta
// agar i , j ko janta hai to 1
// agar i , j ko nhi janta hai to 0

// You are given a party of n people. You have a 2D matrix M such that:
//        M[i][j] == 1 means person i knows person j.
//        M[i][j] == 0 means person i does NOT know person j.
//        Now, a celebrity is a person who:
//        Everyone knows them (column check).
//        But they don’t know anyone else (row check).

//        We need to find if there’s any such person.
//      int[][] M = {
//        {0, 1, 1},  // Person 0 knows Person 1 and 2
//        {0, 0, 1},  // Person 1 knows Person 2
//        {0, 0, 0}   // Person 2 knows NO ONE
//     };

// arr[cle][j] = 0  i person does no about j, so i can be celeb => elemenate --> j
// arr[i][cel] = 1   i person know about j , so elemenate j

import java.util.Stack;

public class _10CelebrityProblem {

    public static int findCelebrity(int[][] M , int n){
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        while (st.size() > 1){
            int i= st.pop();
            int j = st.pop();
            if(M[i][j] == 0){ // syd i celeb ho , j to nhi hai
              st.push(i);
            } else if (M[j][i] == 0) {
                st.push(j);
            }
        }

        if (st.isEmpty()) return -1;
        int potential = st.pop();
        // Check that potential knows no one → row check:
        for (int j = 0; j < n; j++) { // column
            if (M[potential][j] == 1) return -1;
        }

        // Check that everyone knows potential → column check:
        for (int i = 0; i < n; i++) {
            if (i == potential) continue;
            if (M[i][potential] ==0) return -1;
        }
        return potential;
    }

    public static void main(String[] args) {
        int[][] M = {
                {0, 1, 1},
                {0, 0, 1},
                {0, 0, 0}
        };
        int n = M.length;
        int result = findCelebrity(M, n);
        System.out.println(result == -1 ? "No Celebrity" : "Celebrity is: " + result);
    }
}
