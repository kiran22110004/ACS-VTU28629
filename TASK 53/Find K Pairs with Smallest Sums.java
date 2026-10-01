// Program
import java.util.*;

class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(
            (a, b) -> Integer.compare(
                nums1[a[0]] + nums2[a[1]],
                nums1[b[0]] + nums2[b[1]]
            )
        );

        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            minHeap.offer(new int[]{i, 0});
        }

        while (k > 0 && !minHeap.isEmpty()) {
            int[] pair = minHeap.poll();

            int i = pair[0];
            int j = pair[1];

            result.add(Arrays.asList(nums1[i], nums2[j]));
            k--;

            if (j + 1 < nums2.length) {
                minHeap.offer(new int[]{i, j + 1});
            }
        }

        return result;
    }
}
Accepted
Runtime: 2 ms
Case 1
Case 2
Input
nums1 = [1,7,11]
nums2 = [2,4,6]
k = 3
Output
[[1,2],[1,4],[1,6]]
Expected
[[1,2],[1,4],[1,6]]
