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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
    int [] index={postorder.length-1};
    TreeNode root=solve(inorder,postorder,index,0,inorder.length-1);

    return root; 
    }

    private TreeNode solve(int[] in, int[] post, int[]index, int st, int end){
    
    if(index[0] < 0 || st>end) return null;
    
    int ele=post[index[0]];
    TreeNode temp=new TreeNode(post[index[0]--]);
    int position=solve2(in,st,end,ele);

    temp.right=solve(in,post,index,position+1,end);

    temp.left=solve(in,post,index,st,position-1);
    return temp;
    }

    private int solve2(int[] in, int st, int end, int ele){

    for(int i=st ; i<=end ; i++){
    if(in[i]==ele) return i;
    }        
    return -1; }
}