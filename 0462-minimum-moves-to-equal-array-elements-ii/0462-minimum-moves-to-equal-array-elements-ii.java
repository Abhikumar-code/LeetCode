class Solution {
    public int minMoves2(int[] nums) {
        
        Arrays.sort(nums);
        long total=0;

        int mad=nums[nums.length/2];

        for(int i=0; i<nums.length ; i++){
          
          total+=(Math.abs(nums[i]-mad));
        }
   return (int)total; }
}