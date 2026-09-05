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
    public int deepestLeavesSum(TreeNode root) {

    Queue<TreeNode> q=new LinkedList<>();

    if(root == null) return 0;
    
    q.offer(root);
    int sum=0;
    while(!q.isEmpty()){
    sum=0;
    int n =q.size();

    while(n-->0){
    TreeNode temp=q.poll();
    sum+=temp.val;

    if(temp.left != null) q.offer(temp.left);
    if(temp.right != null) q.offer(temp.right);
    }    
    }
  

    return sum;}
}