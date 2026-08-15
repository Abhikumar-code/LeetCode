class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans=new ArrayList<>();
     List<Integer> output=new ArrayList<>();

     int ind=0;

     fun(nums,ind,ans,output);
     return ans;   
    }

    private void fun(int[] nums ,int ind, List<List<Integer>> ans, List<Integer> output){
    
    if(ind >= nums.length){
        ans.add(new ArrayList<>(output));
        return;
    }
    
    fun(nums,ind+1,ans,output);
    int ele=nums[ind];
    output.add(ele);

    fun(nums,ind+1,ans,output);
    output.remove(output.size()-1);
    }
}