class Solution {


    public int sortableIntegers(int[] nums) {
        
        int len=nums.length;
        int sum=0;

        for(int k=1; k<=len; k++){
        
        if(len%k!=0) continue;
        else{
        boolean cur=true;
         int prvMx=Integer.MIN_VALUE;

         for(int j=0 ; j<len ; j+=k){
            int count=0;
            int min=nums[j];
            int max=nums[j];

            for(int m=j+1; m<j+k ; m++){
            if(nums[m-1]>nums[m]) count++;

            max=Math.max(nums[m],max);
            min=Math.min(nums[m],min);
            }
            
            if(nums[j+k-1] > nums[j]) count++;

            if(count>1 || prvMx >min) cur=false;
            prvMx=max;
         }

         if(cur) sum=sum+k;
        }       

        }
   return sum; }

}