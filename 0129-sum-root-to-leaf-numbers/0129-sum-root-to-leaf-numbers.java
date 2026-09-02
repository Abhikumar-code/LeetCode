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
    public int sumNumbers(TreeNode root) {
        int sum=0;
        int total=0;
        if(root == null) return 0;

        sum+=root.val;
        if(root.left == null && root.right==null) return sum; 

        int x=method(root.left,sum,0);
        int y=method(root.right,sum,0);
        return x+y;
    }

    private int method(TreeNode root,int sum, int total){
        if(root==null){
            return 0;
        }

        
        sum*=10;
        sum+=root.val;
        if(root.left == null && root.right ==null) {
            return sum;
        }

        int left=method(root.left,sum,total);
        int right=method(root.right,sum,total);
    

        return left+right;
    }
  
}