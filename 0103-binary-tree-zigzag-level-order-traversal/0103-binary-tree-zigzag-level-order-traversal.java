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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
    
    if(root==null) return new ArrayList<>();

    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> output=new ArrayList<>();

    Queue<TreeNode> q=new LinkedList<>();

    q.offer(root);
    q.offer(null);
    
    boolean x=true;
    while(q.size()>0){
    TreeNode temp=q.poll();

    if(temp==null){
    if(x){ans.add(new ArrayList<>(output)); x=false;}
    else {
     Collections.reverse(output);
     ans.add(new ArrayList<>(output)) ;
     x=true;}

    if(q.isEmpty()) break;

    q.offer(null);
    output.clear();
    continue;
    }
    else output.add(temp.val);
    
    if(temp.left != null) q.offer(temp.left);
    if(temp.right != null) q.offer(temp.right);
    

    }
   return ans; }
}