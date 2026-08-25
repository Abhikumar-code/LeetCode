class Solution {
    public List<List<Integer>> permute(int[] nums) {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer> output=new ArrayList<>();

    fun(nums,ans,output);   
    
    return ans;    
    }

    private void fun(int[] nums, List<List<Integer>> ans, List<Integer> output){

    if(output.size()>=nums.length){
    ans.add(new ArrayList<>(output));
    return ;    
    }

    
    for(int i=0; i<nums.length; i++){
    if(!output.contains(nums[i])){
        output.add(nums[i]);
        fun(nums,ans,output);
        output.remove(output.size()-1);
    }
    }

    }
}