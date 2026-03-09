// you have n boxes of chocolate . Each box cantains a[i] chocolates.
// you need to distribute these boxes among 'm' students such that
// maximum number of chocolates allocated to a student is minimum.
// 1. one box will be allocated to exactly one student.
// 2. All the boxes should be allocated.
// 3. Each student has to allocated at least one box.
// 4. Allotment should be contiguous order , for instance , a student
//     cannot be allocated box 1 and box 3 , skipping box 2.
//  calculates and return that minimum possible number.
// Assume that it is always possible to distributes the chocolates.

// the fist line of input will contain the value of n , the number of
// boxes. The second line of input will contain the n numbers denoting the
// number of chocolates in each box
// The third line will contain the m , number of students.

// input: 4
// 12 34 67 90
// m =2
// output :- 113

public class Main {

  static   boolean isDivisionPossible(int[] a , int m ,int mxChocAllowed){
       int n = a.length;
      int numOfStudents = 1;
      int choc = 0; // number of choc current stu have

        for (int i = 0; i < n; i++) {
         if(a[i] > mxChocAllowed) return false;
         if(choc + a[i] <= mxChocAllowed) {
             choc += a[i];
         } else{
             numOfStudents++;
             choc = a[i];
         }
        }
        return numOfStudents <= m;
    }

    static int minimalMaxima(int[] a , int m) {
        int n = a.length;
        if (n < m) return -1;
        int ans = 0, st = 1, end = (int) 10e9;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (isDivisionPossible(a, m, mid)){
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {12 , 34 ,67 ,90};
        int student = 2;
        System.out.println(minimalMaxima(arr , student)) ;
    }
}


