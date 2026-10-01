// Program
import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : nums) {
            minHeap.offer(num);

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Input
nums = [3,2,1,5,6,4]
k = 2
Output
5
Expected
5
