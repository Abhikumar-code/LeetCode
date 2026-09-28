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
    int ans=0;
    public int amountOfTime(TreeNode root, int start) {
        
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        TreeNode tar=solve(root,start,map);
        solve2(tar,map);
        return ans;
    }

    private TreeNode solve(TreeNode root, int st, HashMap<TreeNode,TreeNode> map ){
    
       Queue<TreeNode> q=new LinkedList<>();
       TreeNode temp=null;
       if(root==null) return null;

       q.offer(root);
       map.put(root,null);

       while(!q.isEmpty()){
       TreeNode front=q.poll();

       if(front.val==st){
        temp=front;
       }    

       if(front.left != null){
        map.put(front.left,front);
        q.offer(front.left);
       }
       if(front.right != null){
        map.put(front.right,front);
        q.offer(front.right);
       }
       }
       return temp;
    }

    private void solve2(TreeNode root, HashMap<TreeNode,TreeNode> map){
     
    HashMap<TreeNode,Boolean> visited=new HashMap<>();
    Queue<TreeNode> q=new LinkedList<>();
    q.offer(root);
    visited.put(root,true); 

    while(!q.isEmpty()){
    
    int n=q.size();
    
    boolean con=false;
    for(int i=0; i<n; i++){
    TreeNode front=q.poll();

    if(front.left != null && !visited.containsKey(front.left)){
        visited.put(front.left,true);
        q.offer(front.left);
        con=true;
    } 
    if(front.right != null && !visited.containsKey(front.right)){
         visited.put(front.right,true);
         q.offer(front.right);
        con=true;
    }
    if(map.get(front) != null && !visited.containsKey(map.get(front))){
        visited.put(map.get(front),true);
        q.offer(map.get(front));
        con=true;
    }
    }
    
    if(con) ans++;
    } 
    
    }
}