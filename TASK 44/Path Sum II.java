// Program
/**
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPaths(root, targetSum, currentPath, result);
        return result;
    }

    private void findPaths(TreeNode node, int targetSum, List<Integer> currentPath, List<List<Integer>> result) {
        if (node == null) {
            return;
        }

        
        currentPath.add(node.val);

        
        if (node.left == null && node.right == null && targetSum == node.val) {
            result.add(new ArrayList<>(currentPath));
        } else {
            
            int remainingSum = targetSum - node.val;
            findPaths(node.left, remainingSum, currentPath, result);
            findPaths(node.right, remainingSum, currentPath, result);
        }

        currentPath.remove(currentPath.size() - 1);
    }
}
Accepted
Runtime: 0 ms
Case 1
Case 2
Case 3
Input
root = [5,4,8,11,null,13,4,7,2,null,null,5,1]
targetSum = 22
Output : [[5,4,11,2],[5,8,4,5]]
Expected : [[5,4,11,2],[5,8,4,5]]
