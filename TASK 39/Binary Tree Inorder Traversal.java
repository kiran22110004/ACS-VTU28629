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
import java.util.Stack;

class Solution {

    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    private void traverse(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        traverse(node.left, result);    
        result.add(node.val);          
        traverse(node.right, result);   
    }

    public List<Integer> inorderTraversalIterative(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
           
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            result.add(curr.val);

           
            curr = curr.right;
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
root = [1,null,2,3]
Output : [1,3,2]
Expected : [1,3,2]
