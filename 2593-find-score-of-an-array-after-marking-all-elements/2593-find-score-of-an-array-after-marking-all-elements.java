class Solution {
    public long findScore(int[] nums) {

    boolean [] visi=new boolean [nums.length];

    PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->{
      
      if(a[0]!=b[0]) return a[0]-b[0];
      return a[1]-b[1];
    }
    );



        for(int i=0; i<nums.length ; i++){
         q.offer(new int[]{nums[i],i});
        }

        long score=0;

        while(!q.isEmpty()){
        int[] cur=q.poll();
        int curr=cur[0];
        int currind=cur[1];
        if(visi[currind]) continue;

        score+=curr;
        visi[currind]=true;

        if(currind>0){
            visi[currind-1]=true;
        }
        if(currind<visi.length-1){
            visi[currind+1] =true;
        }
  
        }
 return score;   }
}