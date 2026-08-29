class Solution {
    public boolean canConstruct(String s, int k) {
      
      if(s.length()<k) return false;
      int [] arr=new int[26];

      for(int i=0; i<s.length(); i++){
      char ch=s.charAt(i);  
      arr[ch-'a']++;
      }

      int numodd=0;
      for(int num:arr){
        if(num%2!=0) numodd++;
      }

      if(numodd>k ) return false;
      
      return true;
    }
}