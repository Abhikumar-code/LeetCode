class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
    
    int i=0;
    int j=0;


    int sum=0;

    int total=0;
    while(j<nums.length){
    
    if(nums[j]==1) sum++;
    

    while(sum>goal && i<nums.length){
    if(nums[i]==1) sum--;
    i++;
    }
    
     if(sum == goal){
       int x=i;
       int tempsum=sum;
       while(x<=j){
       if(tempsum==goal) total++;
       if(nums[x]==1) tempsum--;
       if(tempsum<goal) break;
       x++;
       }
    }

    j++;
    }    

    return total;}
}