class Solution {
    public List<String> letterCasePermutation(String s) {
      List<String> ans=new ArrayList<>();

      StringBuilder sb=new StringBuilder();

      int ind=0;
      fun(s,sb,ind,ans);
      return ans;  
    }

    private void fun(String s, StringBuilder sb, int ind, List<String> ans){
    
    if(ind>=s.length()){
    ans.add(sb.toString());
    return ;
    }
    
    sb.append(s.charAt(ind));
    
    fun(s,sb,ind+1,ans);
    
    if(Character.isLetter(sb.charAt(ind))){
        char ch;
        if(Character.isUpperCase(sb.charAt(ind))) ch=Character.toLowerCase(sb.charAt(ind));
        else ch=Character.toUpperCase(sb.charAt(ind));

        sb.setCharAt(ind,ch);
        fun(s,sb,ind+1,ans);
        sb.deleteCharAt(sb.length()-1);
    }
    else{
        sb.deleteCharAt(sb.length()-1);
    }
       
    }
}