/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (null==root){
            return 0;
        }
        int left=0;
        int right=0;
          left= maxDepth(root.left);
           right=  maxDepth(root.right);

        return Math.max(left,right)+1;
    }
   
}