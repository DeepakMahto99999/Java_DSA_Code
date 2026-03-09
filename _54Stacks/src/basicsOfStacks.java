import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class basicsOfStacks {

    public static void main(String[] args) {
//       int[] arr = new int[5];
//       ArrayList<Integer> arr = new ArrayList<>();

        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        System.out.println("size is "+ st.size());
        System.out.println(st);

        st.push(1);
        System.out.println("size is "+ st.size());
        System.out.println(st);
        st.push(23);
        System.out.println("size is "+ st.size());
        System.out.println(st);
        st.push(90);
        System.out.println("size is "+ st.size());
        System.out.println(st);
        st.push(5);
        System.out.println("size is "+ st.size());
        System.out.println(st);
        st.push(34);

//        // peek
//        System.out.println(st.peek());
//        System.out.println(st);
////        st.pop();
////        System.out.println(st);
////        st.pop();
////        System.out.println(st);
//        System.out.println("size is "+ st.size());
//        while (st.size() > 1){
//            st.pop();
//        }
//        System.out.println(st.peek());
//        System.out.println(st);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number the elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the element : ");

        for (int i = 1; i <=n; i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

    }
}
