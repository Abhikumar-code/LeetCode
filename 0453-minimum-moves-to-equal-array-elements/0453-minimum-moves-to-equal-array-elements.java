class Solution {
    public int minMoves(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        for(int i=0; i<nums.length ; i++){
         if(min>nums[i]) min=nums[i];
        }

        int total=0;
        for(int i=0; i<nums.length ; i++){
          total+=nums[i]-min;
        }
    return total;}
}