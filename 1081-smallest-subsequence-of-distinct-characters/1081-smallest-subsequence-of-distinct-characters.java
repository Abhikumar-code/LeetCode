class Solution {
    public String smallestSubsequence(String s) {
        
        int [] ans=new  int[26];
        for(int i=0; i<s.length() ; i++){
        char ch=s.charAt(i);
        ans[ch-'a']++;
        }

        HashSet<Character> set=new HashSet<>();
        Stack<Character> st=new Stack<>();

        for(int i=0; i<s.length() ; i++){
        char ch=s.charAt(i);

        ans[ch-'a']--;
        if(set.contains(ch)) continue;
        else{
            while(!st.isEmpty() && st.peek()> ch && ans[st.peek()-'a'] > 0){
            char temp=st.pop();
            set.remove(temp);
            }
        }
        
        st.push(ch);
        set.add(ch);
        }

        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
        sb.append(st.pop());
        }
    return sb.reverse().toString();}
}