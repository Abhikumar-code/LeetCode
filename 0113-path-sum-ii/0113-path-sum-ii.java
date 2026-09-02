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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> output=new ArrayList<>();
        if(root==null) return ans;

        method(root,ans,output,targetSum,0);
        return ans;
    }

    private void method(TreeNode root, List<List<Integer>> ans, List<Integer> output,int target, int sum ){
    
    if(root == null) return;
    
    sum+=root.val;
    output.add(root.val);

    if(sum==target && root.left == null && root.right ==null){
        ans.add(new ArrayList<>(output));
        output.remove(output.size()-1); 
        return;
    }

    method(root.left,ans,output,target,sum);
    method(root.right,ans,output,target,sum);

    output.remove(output.size()-1); 
    }
}