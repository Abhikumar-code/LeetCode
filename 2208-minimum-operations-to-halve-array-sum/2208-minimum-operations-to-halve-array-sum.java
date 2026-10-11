class Solution {
    public int halveArray(int[] nums) {
    if(nums.length==0) return -1;
    PriorityQueue<Double> q=new PriorityQueue<>((a,b)->{
        return Double.compare(b,a);
    });
    double tosum=0;
    
    for(int num:nums){  
     tosum+=num;
     q.offer((double)num);
    }

    if(tosum==0) return -1; 
    
    int ele=0;
    double sum=tosum;
    while(2*sum>tosum){
       double top=q.poll()/(long)2;
       sum-=top;
       ele++;
       q.offer(top); 

    }



    return ele;}
}