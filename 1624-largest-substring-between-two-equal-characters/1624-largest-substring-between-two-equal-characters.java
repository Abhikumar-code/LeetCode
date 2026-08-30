class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
  
      int longest=-1;


      for(int i=0; i<s.length(); i++){
      char ch=s.charAt(i);
      
      int x=s.lastIndexOf(ch);
      if(i!=x) longest=Math.max(longest,x-i-1);
      } 
    return longest;}
}