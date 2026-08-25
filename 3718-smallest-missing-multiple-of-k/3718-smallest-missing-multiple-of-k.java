class Solution {
    public int missingMultiple(int[] nums, int k) {
    
    Arrays.sort(nums);
    int num=k;
    int m=1;
  for(int i=0; i<nums.length; i++){
    if(nums[i]==num){
    m++;    
    num=k*m;
    
    }
  } 

    return num;}
}