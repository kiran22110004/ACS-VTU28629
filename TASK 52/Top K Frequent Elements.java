// Program
import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     
        HashMap<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> frequency.get(a) - frequency.get(b)
        );

        for (int num : frequency.keySet()) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = minHeap.poll();
        }

        return result;
    }
}
Accepted
Runtime: 1 ms
Case 1
Case 2
Case 3
Input
nums = [1,1,1,2,2,3]
k = 2
Output
[2,1]
Expected
[1,2]
