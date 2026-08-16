class Solution {
    public List<String> letterCombinations(String digits) {
    List<String> ans =new ArrayList<>();
    StringBuilder output=new StringBuilder();
     
    String [] mapping={" " , " ", "abc", "def","ghi","jkl","mno","pqrs", "tuv","wxyz"};
    int ind=0;
    fun(digits,ind,output,ans,mapping);
    return ans;      
    }

    public void fun(String digits,int ind, StringBuilder sb, List<String> ans, String[] mapping){
    
    if(ind>=digits.length()){
    ans.add(sb.toString());
    return ;
    }
    
    int num=digits.charAt(ind)-'0';
    String value=mapping[num];

    for(int i=0; i<value.length(); i++){
    sb.append(value.charAt(i));
    fun(digits,ind+1, sb, ans, mapping);
    sb.deleteCharAt(sb.length()-1);
    }

    }
}