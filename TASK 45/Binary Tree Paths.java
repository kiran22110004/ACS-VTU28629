// Program
**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            constructPaths(root, "", result);
        }
        return result;
    }

    private void constructPaths(TreeNode node, String path, List<String> result) {
        if (node.left == null && node.right == null) {
            result.add(path + node.val);
            return;
        }

        path += node.val + "->";
        if (node.left != null) {
            constructPaths(node.left, path, result);
        }
        if (node.right != null) {
            constructPaths(node.right, path, result);
        }
    }
}


Accepted
Runtime: 2 ms
Case 1
Case 2
Input
root = [1,2,3,null,5]
Output : ["1->2->5","1->3"]
Expected : ["1->2->5","1->3"]
