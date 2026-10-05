class Solution {
    public String clearStars(String s) {
        
    HashMap<Character,List<Integer>> map=new HashMap<>();
    PriorityQueue<Character> q=new PriorityQueue<>((a,b) -> a-b);

    boolean [] ban=new boolean[s.length()];

    for(int i=0; i<s.length() ; i++){
    char ch=s.charAt(i);
   
    if(ch=='*'){
     char temp= q.peek();

     List<Integer> list =map.get(temp);
     ban[list.get(list.size()-1)]=true;

     map.get(temp).remove(list.size()-1);
     

     if(list.size()==0){
        map.remove(temp);
        q.poll();
     }

    }
    else{
        
    if(map.containsKey(ch)){
        map.get(ch).add(i);
    }
    else{
        map.put(ch,new ArrayList<>());
        map.get(ch).add(i);
        q.offer(ch);
    }
    }

    }
    

    StringBuilder sb=new StringBuilder();
    for(int i=0; i<s.length(); i++){
    char ch=s.charAt(i);
    if(!ban[i] && ch != '*'){
        sb.append(ch);
    } 
    }

    return sb.toString();}
}