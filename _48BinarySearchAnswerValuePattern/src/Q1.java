// there are n number of spot in race track we have m number of student
// we have to keep maximum distance between students so not colaid


public class Q1 {

    static boolean isPossible(int[] a , int k , int dist){
        int n = a.length;
        int kidsPlaced =1;
        int lastKid = a[0];

        for(int i = 1; i < n; i++) {
            if(a[i] - lastKid >= dist){
                kidsPlaced++;
                lastKid = a[i];
            }
        }
         return kidsPlaced >= k;
    }

    static int raceTrack(int[] a , int k){
        int n = a.length;
        if(k > n) return -1;
        int st =0 , end = (int) 1e9;
        int ans =-1;
        while (st <= end){
            int mid = st + (end -st)/2;
            if(isPossible(a , k ,mid)){ // can k kids be placed such that no 2 kids have distance lesser than mid
                ans = mid;
                st = mid +1;
            } else {
                end = mid -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
     int[] a = {1 ,2,4,8,9};
     int k =2;
     System.out.println(raceTrack(a ,k));
    }

}
