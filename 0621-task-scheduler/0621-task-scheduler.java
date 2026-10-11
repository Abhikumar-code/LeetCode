class Solution {
    public int leastInterval(char[] tasks, int n) {
    
        int [] ans=new int[26];
        for(char ch:tasks){
         ans[ch-'A']++;
        }
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0; i<ans.length; i++){   
         if(ans[i] > 0) q.offer(ans[i]);
        }
        
        int count=0;
        while(!q.isEmpty()){
         int used=0;
         List<Integer> list=new ArrayList<>();
        
         while(!q.isEmpty() && used<n+1){
         int ch=q.poll();
 
         ch--;
         if(ch>0) list.add(ch);
         used++;
         }
         

         for(int num:list){
            q.offer(num);
         }

         if(q.isEmpty()) {
            count+=used;
            break;
         }
         
         count+=n+1;
                                          
        }
   return count; }
}