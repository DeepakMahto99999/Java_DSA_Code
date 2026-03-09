import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class practice {

    static void bucketSort(int[] arr, int noOfBuckets) {

        // Find the maximum and minimum elements in the array
        int globalMax = Integer.MIN_VALUE;
        int globalMin = Integer.MAX_VALUE;
        for (int num : arr) {
            globalMin = Math.min(num, globalMin);
            globalMax = Math.max(num, globalMax);
        }

        // Calculate the range of numbers
        int range = globalMax - globalMin;
        int bucketRange = (int) Math.ceil((double) range / noOfBuckets);

        // Create the bucket array
        List<Integer>[] buckets = new List[noOfBuckets];

        // Initialize each bucket as an ArrayList
        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new ArrayList<>();
        }

        // Assign numbers from the array to the proper bucket
        for (int num : arr) {
            // Directly calculate the bucket index
            int bucketIndex = (num - globalMin) / bucketRange;
            if (bucketIndex == noOfBuckets) {
                bucketIndex--; // Ensure we don't go out of bounds
            }
            buckets[bucketIndex].add(num);
        }

        // Sort each bucket
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int idx = 0;
        // Merge the buckets to get the sorted array
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                arr[idx++] = num;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 6, 2, 7, 1, 8, 4, 5, -1, -3, -4 };
        int noOfBuckets = 3;
        bucketSort(arr, noOfBuckets);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
