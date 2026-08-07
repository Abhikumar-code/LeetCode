class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet<Character> list=new HashSet<>();
     int i=0;
     int j=0;
     int Max=0;
      while(i<s.length()){
      if(list.contains(s.charAt(i))){
        list.remove(s.charAt(j));
        j++;
      }
      else{
      list.add(s.charAt(i));
        Max=Math.max(Max,i-j+1);
        i++;
      }
      
      }
 return Max;   }
}