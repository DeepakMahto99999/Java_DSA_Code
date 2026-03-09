
public class Main {

    static void displayArr(int[] arr){              // [L1]
        for(int val : arr){                        // [L2]
            System.out.print(val + " ");           // [L3]
        }
        System.out.println();                      // [L4]
    }

    static void merge(int[] arr, int l, int mid, int r){  // [M1]
        int n1 = mid-l+1;                          // [M2]
        int n2 = r-mid;                            // [M3]
        int[] left = new int[n1];                  // [M4]
        int[] right = new int[n2];                 // [M5]

        for(int i = 0; i < n1; i++)                // [M6]
            left[i] = arr[l+i];                    // [M7]

        for(int j = 0; j < n2; j++)                // [M8]
            right[j] = arr[mid+1+j];               // [M9]

        int  i = 0;                                // [M10]
        int  j = 0;                                // [M11]
        int k = l;                                 // [M12]

        while(i < n1 && j < n2){                   // [M13]
            if(left[i] < right[j])                 // [M14]
                arr[k++] = left[i++];              // [M15]
            else
                arr[k++] = right[j++];             // [M16]
        }

        while(i < n1)                              // [M17]
            arr[k++] = left[i++];                  // [M18]

        while (j < n2)                             // [M19]
            arr[k++] = right[j++];                 // [M20]
    }

    static void mergeSort(int[] arr, int l, int r){  // [S1]
        if(l >= r) return;                         // [S2]  base case

        int mid = (l+r)/2;                         // [S3]

        mergeSort(arr, l, mid);    // A (left)     // [S4]
        mergeSort(arr, mid+1, r);  // B (right)    // [S5]

        merge(arr, l, mid, r);     // C (merge)    // [S6]
    }

    public static void main(String[] args) {       // [MAIN1]
        int[] arr = {7, 6, 5, 4, 2, 1, 0};         // [MAIN2]
        int n = arr.length;                        // [MAIN3]
        System.out.println("Array before sorting");// [MAIN4]

        displayArr(arr);                           // [MAIN5]

        mergeSort(arr, 0, n-1);                    // [MAIN6]

        System.out.println("Array after sorting"); // [MAIN7]
        displayArr(arr);                           // [MAIN8]
    }
}


//  mergeSort(0,6)
//  ├── mergeSort(0,3)
//  │     ├── mergeSort(0,1)
//  │     │      ├── mergeSort(0,0)
//  │     │      └── mergeSort(1,1)
//  │     │      └── merge(0,0,1)
//  │     ├── mergeSort(2,3)
//  │     │      ├── mergeSort(2,2)
//  │     │      └── mergeSort(3,3)
//  │     │      └── merge(2,2,3)
//  │     └── merge(0,1,3)
//  ├── mergeSort(4,6)
//  │     ├── mergeSort(4,5)
//  │     │      ├── mergeSort(4,4)
//  │     │      └── mergeSort(5,5)
//  │     │      └── merge(4,4,5)
//  │     ├── mergeSort(6,6)
//  │     └── merge(4,5,6)
//  └── merge(0,3,6)



//4. Stack visualization & exact call order

// Think of each mergeSort call as a box pushed onto a stack.
// Step 1 – First call
// Call from main:
// MS(0,6)
// Inside MS(0,6):
// [S2] if(l >= r) → 0 >= 6? No.
// [S3] mid = (0+6)/2 = 3
// [S4] mergeSort(arr, 0, 3); → A (left)
//  New call pushed: MS(0,3)

//Stack :
// MS(0,3) ← currently running
// MS(0,6)

//  Step 2 – Inside MS(0,3)
//  [S2] 0 >= 3? No
//  [S3] mid = (0+3)/2 = 1
//  [S4] A: mergeSort(arr, 0, 1);
//  Push: MS(0,1)

// Stack:
// MS(0,1)
// MS(0,3)
// MS(0,6)

//  Step 3 – Inside MS(0,1)
//  [S2] 0 >= 1? No
//  [S3] mid = (0+1)/2 = 0
//  [S4] A: mergeSort(arr, 0, 0);

// Push: MS(0,0)
// Stack:
// MS(0,0)
// MS(0,1)
// MS(0,3)
// MS(0,6)

// MS(0,0):

// [S2] 0 >= 0? Yes → return immediately
//  (No B, no C here.)
//  Pop MS(0,0).

// Now back to MS(0,1) after line [S4].


//  Step 4 – MS(0,1) resumes, now does B
//  We are in MS(0,1):
//        [S5] mergeSort(arr, mid+1, r); → mergeSort(arr, 1, 1); B (right)
//  Push:
//  MS(1,1)
//  Stack:
//  MS(1,1)
//  MS(0,1)
//  MS(0,3)
//  MS(0,6)

//  MS(1,1):
//  [S2] 1 >= 1? Yes → return
//  Pop MS(1,1).
//
//  Step 5 – MS(0,1) now calls C
//  We’re back in MS(0,1) after A and B:
//  [S6]  merge(arr, 0, 0, 1); → C
//  So the EXACT moment C for (0,1) runs:
//  After MS(0,0) and MS(1,1) are both finished and returned.
//  We’ll deep-dive into this merge in Section 5.
//  here go to the merge function # merge(arr , 0 , 0 , 1)
//  merge function will return this:-
//  int n1 = mid - l + 1;   // n1 = 0 - 0 + 1 = 1
//  int n2 = r - mid;       // n2 = 1 - 0 = 1
//  left = int[1]
//  right = int[1]
//  left --> [7] , right --> [6]
//  now original array: [7, 6, 5, 4, 2, 1, 0]
//  after while loop
//  arr = [6, 6, 5, 4, 2, 1, 0]
//         ^  ^
//         k  j
//  arr = [6, 7, 5, 4, 2, 1, 0]
//            ^  ^
//            k  i
//  arr --> [6 , 7] k = 0 , 1 --> this return after sorted to [0, 3]
//  After merge(0,0,1) returns, MS(0,1) has no more lines → returns.
//  Pop MS(0,1).

// Stack now:
// MS(0,3)
// MS(0,6)

//  Step 6 – Back to MS(0,3), now B
//  Inside MS(0,3) after finishing A:
//  [S5] B: mergeSort(arr, 2, 3);
//  Push:  MS(2,3)
//  Stack:
//  MS(2,3)
//  MS(0,3)
//  MS(0,6)

//  Inside MS(2,3):
//  [S2] 2 >= 3? No
//  [S3] mid = (2+3)/2 = 2
//  [S4] A: mergeSort(arr, 2, 2);

//  Push: MS(2,2)
//  MS(2,2) → base case (2 >= 2) → returns. Pop.
//  Back to MS(2,3):
//  [S5] B: mergeSort(arr, 3, 3);
//  Push:  MS(3,3)
//  MS(3,3) → base case → returns. Pop.
//  Now MS(2,3):
//  # [S6] C: merge(arr, 2, 2, 3);
//  Now here:-
//  int n1 = 2 - 2 + 1 => 1
//  int n2 = 3 - 2 = 1
//  left ->  arr[l+i] -> arr[2+0]  -> 5
//  right -> arr[mid+1+j] -> arr[2+1+0] -> arr[3] --> 4
//  before while loop arr --> [6, 7, 5, 4, 2, 1, 0]
//  after while loop  arr --> [6, 7, 4, 5, 2, 1, 0]

//  After that merge, MS(2,3) returns. Pop.  arr --> 4 , 5
//  Stack now:
//  MS(0,3)
//  MS(0,6)

//  Step 7 – MS(0,3) now calls its C
//  Now in MS(0,3):
//  Both A (MS(0,1)) and B (MS(2,3)) finished.
//  Now [S6] C: merge(arr, 0, 1, 3);
//  int n1 = mid -l+1 --> 1 - 0 + 1 -> 2
//  int n2 = r - mid -> 3 - 1 -> 2
//  left --> 6 , 7
//  right --> 4 , 5
//  after while loop they become
//  arr[4, 5, 6, 7, 2, 1, 0]
//  After merge(0,1,3), MS(0,3) returns. Pop. arr  --> 4 , 5 , 6 , 7
//  Stack:
//  MS(0,6)

//  Step 8 – Now MS(0,6) does its B
//  We’re back in the very first call:
//  Inside MS(0,6) after finishing A (MS(0,3)):
//  [S5] B: mergeSort(arr, 4, 6);
//  Push: MS(4,6)
//  Stack:
//  MS(4,6)
//  MS(0,6)

//  Inside MS(4,6):
//  [S2] 4 >= 6? No
//  [S3] mid = (4+6)/2 = 5
//  [S4] A: mergeSort(arr, 4, 5);

//  Push: MS(4,5)
//  Stack:
//  MS(4,5)
//  MS(4,6)
//  MS(0,6)

//  Inside MS(4,5):
//  mid = (4+5)/2 = 4
//  A: MS(4,4) → base, returns
//  B: MS(5,5) → base, returns
// # C: merge(4,4,5)
//  int n1 = 4 - 4 + 1 = 1
//  int n2 = 5 - 4 = 1
//  left --> 2
//  right --> 1
//  [4, 5, 6, 7, 1, 2, 0]
//  after while loop 1 2
//  return MS(4,5)  --> arr  1 , 2

//  Stack:
//  MS(4,6)
//  MS(0,6)

//  Continue MS(4,6):
//        [S5] B: MS(6,6) → base, returns
//  [S6] C: merge(4,5,6)
//  return MS(4,6)
//  int n1 = 5-4 +1  = 2
//  int n2 = 6-5 = 1
//  left[0] = arr[4] = 1
//  left[1] = arr[5] = 2
//  right[0] = arr[6] =0
//  after while loop arr -->
//  [4, 5, 6, 7, 0, 1, 2]
//   return MS(4,6)  arr 0 , 1


// Step 9 – Final C for whole array
// Back in MS(0,6):
// A (MS(0,3)) done
// B (MS(4,6)) done
// Now:   [S6] C: merge(arr, 0, 3, 6);
// int n1 = 3 - 0 + 1 = 4
// int n2 = 6 - 3 = 3
// left --> 4 5 6 7
// right --> 0 1 2
// after while loop they become [0, 1, 2, 4, 5, 6, 7]
//After this merge, MS(0,6) returns to main. Stack empty again.





