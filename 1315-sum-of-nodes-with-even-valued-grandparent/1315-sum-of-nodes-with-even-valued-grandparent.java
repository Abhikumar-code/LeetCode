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
   int sum=0; 
    public int sumEvenGrandparent(TreeNode root) {
   
    method(root);
    return sum;  
    }

    private void method(TreeNode root){

    if(root == null) return ;

    if(root.val%2 == 0){
        sum+=method2(root,2);
    }   

    method(root.left);
    method(root.right);
    }

    private int method2(TreeNode root,int level){
    
    if(root==null) return 0;
    
    if(level == 0) return root.val;
    int x=method2(root.left,level-1);
    int y=method2(root.right,level-1);
    return x+y;
    }
}