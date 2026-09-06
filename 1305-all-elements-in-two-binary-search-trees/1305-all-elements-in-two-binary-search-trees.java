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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
      List<Integer> ans=new ArrayList<>();
      List<Integer> ans2=new ArrayList<>();      
   
      method(root1,ans);
      method2(root2,ans2);

      int i=0;
      int j=0;
      while(i<ans.size() && j<ans2.size()){
      
      if(ans.get(i)<=ans2.get(j)){
        i++;
      }
      else{
      ans.add(i,ans2.get(j));
      i++;
      j++;
      }
    }

      while(j<ans2.size()){
      ans.add(ans2.get(j));
      j++;
      }
      
      return ans;  
    }

    private void method(TreeNode root1, List<Integer> ans){
    
    if(root1==null ) return;

    method(root1.left,ans);
    ans.add(root1.val);
    method(root1.right,ans);
    }
    private void method2(TreeNode root2, List<Integer> ans2){
    
    if(root2==null ) return;

    method(root2.left,ans2);
    ans2.add(root2.val);
    method(root2.right,ans2);
    }
}