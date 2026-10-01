// Program
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }

        int maxFreq = 0;
        int countMax = 0;

        for (int f : freq) {
            if (f > maxFreq) {
                maxFreq = f;
                countMax = 1;
            } else if (f == maxFreq) {
                countMax++;
            }
        }

        int result = (maxFreq - 1) * (n + 1) + countMax;

        return Math.max(result, tasks.length);
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
tasks = ["A","A","A","B","B","B"]
n = 2
Output : 8
Expected : 8
