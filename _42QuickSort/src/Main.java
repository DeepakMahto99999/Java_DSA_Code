
public class Main {

    static void displayArr(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr , int x ,int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr , int st , int end){
        int pivot = arr[st];
        int count =0;

        for (int i = st+1; i <= end; i++){
            if(arr[i] <= pivot) count++;
        }

        int pivotIdx = st + count;
        swap(arr , st, pivotIdx);

        int i = st , j =end;
        // element lesser or equal left of pivotIdx ,
        // grater --> right side of pivotIdx
        while(i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr , i ,j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickSort(int[] arr , int st , int end){
       if(st >= end) return;
       int pi = partition(arr ,st ,end);
       quickSort(arr , st ,pi-1);
       quickSort(arr , pi+1 ,end);
    }


    public static void main(String[] args) {
       int[] arr = {7 ,13, 8, 5, 10, 2, 4};
        System.out.println("Array before sorting");
        displayArr(arr);
        quickSort(arr, 0 , arr.length-1);
        System.out.println("Array after sorting");
        displayArr(arr);
    }
}


//  ⭐ Where each part of code is used
//   partition():
//   Picks pivot
//   Counts correct position
//   Swaps pivot into position
//   Rearranges left & right elements
//   Returns pivot index

//   quickSort():
//   Divides array into subarrays
//   Recursively sorts left half and right half

//  swap():
//  Used to exchange values during partitioning
//  displayArr():
//  Prints array before and after sorting

//  [7, 13, 8, 5, 10, 2, 4]
//   quickSort(arr, 0, 6)
//  ⭐ STEP 1 — First Partition (st=0, end=6)
//    pivot = arr[0] = 7
//    Total = 3 elements ≤ 7
//    pivotIdx = 0 + 3 = 3
//    Swap arr[0] with arr[3]:
//                  0   1  2  3   4  5  6
//    Before swap: [7, 13, 8, 5, 10, 2, 4]
//    After swap : [5, 13, 8, 7, 10, 2, 4]
//    2️⃣ Fix elements left & right of pivot (pivot = 7 at index 3)
//     i = 0 , j = 6
//   arr[i]=5 ≤ 7 → i becomes 1
//   arr[j]=4 ≤ 7 → j stays 6 (because arr[j] > pivot expected to decrease)
//   arr[6] = 4 → not > pivot ⇒ stop
//   Now i=1, j=6 → both cross conditions → swap.
//   Swap arr[1] and arr[6]:
//   [5, 4, 8, 7, 10, 2, 13]
//   i++ → 2
//   j-- → 5
//   ✔ round 2
//   i moves until arr[i] > pivot:
//   arr[2] = 8 > 7 → stop.
//   j moves until arr[j] ≤ pivot:
//   arr[5] = 2 ≤ 7 → stop.
//   Swap arr[2] and arr[5]:
//                   0  1  2  3   4  5   6
//    before swap : [5, 13, 8, 7, 10, 2, 4]
//    after swap  : [5, 4, 2, 7, 10, 8, 13]
//    i++ → 3
//    j-- → 4  STOP Condition
//    i == pivotIdx → stop loop.
//    pivot index returned = 3
//    Now QuickSort recurses:
//    quickSort(arr, 0, 2);
//    quickSort(arr, 4, 6);


//   ⭐ STEP 2 — QuickSort Left (0 to 2)
//   array part:- [5, 4, 2]
//   pivot = 5
//   count = 2
//   pivotIdx = 0 + 2 = 2
//   Swap arr[0] and arr[2]:
//   [2, 4, 5]
//   i=0, j=2 → loop ends immediately
//   (pivot already at correct position)
//   quickSort(arr, 0, 1);
//   quickSort(arr, 3, 2); // ignored



// ⭐ STEP 3 — QuickSort (0 to 1)
// Array part: [2, 4]

// 1️⃣ Choose pivot
// pivot = arr[0] = 2

// 2️⃣ Count elements ≤ pivot
// Check 4 → 4 is NOT ≤ 2
// count = 0
// pivotIdx = 0 + 0 = 0

// 3️⃣ Swap pivot to correct position
// Swap arr[0] with arr[0] → no change
// Array stays: [2, 4]

// 4️⃣ Left & Right pointer fixing
// i = 0 , j = 1
// Loop condition: (i < pivotIdx && j > pivotIdx)
// That is: (0 < 0 && 1 > 0) → FALSE
// So loop does NOT run
// Pivot already at correct place

// 5️⃣ partition() returns pivotIdx = 0

// 6️⃣ Now QuickSort recursion begins

// Left side call:
// quickSort(arr, 0, pi-1)
// quickSort(arr, 0, -1)
// Base case: 0 >= -1 → true → returns immediately
// After returning, control goes back to quickSort(arr, 0, 1)

// Right side call:
// quickSort(arr, pi+1, 1)
// quickSort(arr, 1, 1)
// Base case: 1 >= 1 → true → returns immediately
// After returning, control again goes back to quickSort(arr, 0, 1)

// Now both left and right recursive calls are finished
// So quickSort(arr, 0, 1) also returns to its caller → quickSort(arr, 0, 2)

// ✔️ Subarray [2, 4] is already sorted
// Left half result: [2, 4, 5]



// ⭐ STEP 4 — QuickSort Right (4 to 6)
// Array part: [10, 8, 13]

// 1️⃣ Choose pivot
// pivot = arr[4] = 10

// 2️⃣ Count elements ≤ pivot
// Check 8 → 8 ≤ 10 → yes
// Check 13 → 13 ≤ 10 → no
// count = 1
// pivotIdx = 4 + 1 = 5

// 3️⃣ Swap pivot to correct position
// Swap arr[4] with arr[5]
// Before: [10, 8, 13]
// After :  [8, 10, 13]
// Full array becomes: [2, 4, 5, 7, 8, 10, 13]

// 4️⃣ Left & Right pointer fixing
// i = 4 , j = 6
// arr[i] = 8 ≤ 10 → i = 5
// Now i == pivotIdx → loop stops immediately
// No swapping needed

// 5️⃣ partition() returns pivotIdx = 5

// 6️⃣ Now QuickSort recursion begins

// Left side call:
// quickSort(arr, 4, pi-1)
// quickSort(arr, 4, 4)
// Base case: 4 >= 4 → true → returns immediately
// After return, control goes back to quickSort(arr, 4, 6)

// Right side call:
// quickSort(arr, pi+1, 6)
// quickSort(arr, 6, 6)
// Base case: 6 >= 6 → true → returns immediately
// After return, control again goes back to quickSort(arr, 4, 6)

// Both left and right recursive calls finished
// So quickSort(arr, 4, 6) also returns to its caller → quickSort(arr, 0, 6)

// ✔️ Subarray [8, 10, 13] is sorted
// ✔️ Entire array is now fully sorted

// 🎉 FINAL SORTED ARRAY
// 2 4 5 7 8 10 13



