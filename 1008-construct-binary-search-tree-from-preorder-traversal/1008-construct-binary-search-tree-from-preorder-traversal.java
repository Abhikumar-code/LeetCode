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
    int ind=0;
    public TreeNode bstFromPreorder(int[] preorder) {
        
        TreeNode root=solve(preorder,Integer.MIN_VALUE,Integer.MAX_VALUE);
        return root;
    }

    private TreeNode solve(int[] preorder,int min, int max){
    
    if(ind>preorder.length-1 ) return null;
    
    int pre=preorder[ind];
    if(pre>min && pre<max){
        TreeNode temp=new TreeNode(pre);
        ind++;
        temp.left=solve(preorder,min,pre);
        temp.right=solve(preorder,pre,max);
        return temp;
    }
    else {
        return null;
    }
    }
}