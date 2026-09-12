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
class Solution {
    int nodes=0;
    public int countDominantNodes(TreeNode root) {
      if(root==null) return 0;
      solve(root);
      return nodes;  
    }

    private int solve(TreeNode root){

    if(root==null) return Integer.MIN_VALUE; 

     int x= solve(root.left);
     int y= solve(root.right);
     
     if(root.val>=Math.max(x,y)){
        nodes++;
     }

    return Math.max(x,Math.max(y,root.val));
    }
}