public class _1mazePath {

    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int count = maze(1,1,rows,cols);
        System.out.println(count);
    }

    
    private static int maze(int sr, int sc, int er, int ec) {

       if(sr > er || sc > ec) return 0;
       if (sr == er && sc == ec) return 1;
       int downWays = maze(sr+1,sc,er,ec);
       int rightWays = maze(sr,sc+1,er,ec);
       int totalWays = downWays + rightWays;
       return totalWays;

    }

}

//maze(1,1)
//├── 🔽 maze(2,1)
//│   ├── 🔽 maze(3,1)
//│   │   ├── 🔽 maze(4,1) ❌ → 0
//        │   │   └── ➡️ maze(3,2)
//│   │       ├── 🔽 maze(4,2) ❌ → 0
//        │   │       └── ➡️ maze(3,3) 🎯 → 1
//        │   │       → total = 1
//        │   └── ➡️ maze(2,2)
//│       ├── 🔽 maze(3,2)
//│       │   ├── 🔽 maze(4,2) ❌ → 0
//        │       │   └── ➡️ maze(3,3) 🎯 → 1
//        │       │   → total = 1
//        │       └── ➡️ maze(2,3)
//│           ├── 🔽 maze(3,3) 🎯 → 1
//        │           └── ➡️ maze(2,4) ❌ → 0
//        │           → total = 1
//        │       → total = 2
//        │   → total = 3
//        └── ➡️ maze(1,2)
//    ├── 🔽 maze(2,2)
//    │   (Already computed: 2)
//        └── ➡️ maze(1,3)
//        ├── 🔽 maze(2,3)
//        │   (Already computed: 1)
//        └── ➡️ maze(1,4) ❌ → 0
//        → total = 1
//        → total = 3
//
//        🎯 Final result: 3 (down) + 3 (right) = **6 paths**

// ✅ “In each call, Java runs downWays first. If it reaches out-of-bounds
// or base case, it returns, and then rightWays is executed.”

