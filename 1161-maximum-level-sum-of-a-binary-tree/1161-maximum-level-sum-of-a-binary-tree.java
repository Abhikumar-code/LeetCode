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
    public int maxLevelSum(TreeNode root) {
    
    int [] max=new int[2];
    max[1]=Integer.MIN_VALUE;
    Queue<TreeNode> q=new LinkedList<>();
    if(root==null) return max[0];
    
    q.offer(root);
    q.offer(null);

    int level=1;
    int sum=0;
    while(!q.isEmpty()){
    TreeNode temp=q.poll();

    if(temp==null){
      
      if(max[1]<sum){
        max[0]=level;
        max[1]=sum;
      }
      
      level++;
      sum=0;
      if(q.isEmpty()) break;
      q.offer(null);
      continue;
    }

    sum+=temp.val;

    if(temp.left != null) q.offer(temp.left);
    if(temp.right != null) q.offer(temp.right);

    }   
  return max[0];  }  
}
