// Program
import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }

                if (node.right != null) {
                    queue.offer(node.right);
                }

                if (i == size - 1) {
                    result.add(node.val);
                }
            }
        }

        return result;
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Case 4
Input
root = [1,2,3,null,5,null,4]
Output : [1,3,4]
Expected : [1,3,4]
