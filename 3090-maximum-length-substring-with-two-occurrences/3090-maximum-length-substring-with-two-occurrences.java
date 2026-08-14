class Solution {
    public int maximumLengthSubstring(String s) {
      HashMap<Character,Integer> map=new HashMap<>();


      int max=0;


      int i=0;
      
      for(int j=0; j<s.length() ; j++){
      
      char ch=s.charAt(j);
      map.put(ch,map.getOrDefault(ch,0)+1);
     
      while(i<s.length() && map.get(ch)>2){
      char temp=s.charAt(i);  
      map.put(temp,map.get(temp)-1) ;
      i++; 
        
      }
     
       max=Math.max(max,(j-i+1));       
      
    
      }

 return max;   }
}