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
    int goodNodes=0;
    public int goodNodes(TreeNode root) {

       solve(root,Integer.MIN_VALUE);
       return goodNodes; 
    }

    private void solve(TreeNode root,int maxsum){
    
    if(root==null) return;
    if(root.val>=maxsum){
        goodNodes++;
        maxsum=root.val;
    }


    solve(root.left,maxsum);
    solve(root.right,maxsum); 

    }
}