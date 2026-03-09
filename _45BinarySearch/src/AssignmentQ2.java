// You are given a sorted array containing N integers and a number
//  target. Implement the upper bound function that returns the
//  index of an element just greater than the target element.
//  If there exists no such element then return -1.
//Note: The target may not be present in the array.
//  N=10, target= 3
//  Array = 1 3 3 4 5 8 9 11 15 15
//  output :-       3

public class AssignmentQ2 {

    public static int upperBound(int[] arr, int target) {
        int st = 0;
        int end= arr.length - 1;
        int answer = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] > target) {
                answer = mid;
                end= mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 4, 5, 8, 9, 11, 15, 15};
        int target = 3;
        System.out.println(upperBound(arr, target));
    }
}

