class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
      HashMap<String , Integer> map=new HashMap<>();
      int totalwindow=0;
      int aclen=words[0].length();

      for(String sk:words){
        map.put(sk,map.getOrDefault(sk,0)+1);
        totalwindow+=sk.length();
      }  

      List<Integer> ans=new ArrayList<>();
      

      for (int offset = 0; offset < aclen; offset++) {
         int ind = offset;
         int st = offset;
         HashMap<String , Integer> curr=new HashMap<>();
        while(ind<=s.length()-aclen){
           String sk=s.substring(ind,ind+aclen);
           
           if(map.containsKey(sk)){
                curr.put(sk,curr.getOrDefault(sk,0)+1);
           }
           else {
            curr.clear();
            st=ind+aclen;
           }
           
           while(map.containsKey(sk) && (curr.containsKey(sk) && curr.get(sk)>map.get(sk))){
           String sk1=s.substring(st,st+aclen);
           curr.put(sk1,curr.get(sk1)-1);
           if(curr.containsKey(sk1) && curr.get(sk1)==0) curr.remove(sk1);
           st+=aclen;
           }

           if(ind+aclen-st==totalwindow && method(map,curr)){
            ans.add(st);
           }
           ind+=aclen; 
           
      }
}
   
   return ans; }
        

        private boolean method(HashMap<String , Integer> curr,HashMap<String , Integer> map){
         
         if(!map.equals(curr)) return false;
         return true;
        }
}