class Solution {
    public int minInsertions(String s) {

    int need=0;
    int count=0;
    Stack<Character> top=new Stack<>();

    for(int i=0; i<s.length(); i++){
    char ch=s.charAt(i);

    if(ch=='('){
        if(count==1){
            need++;
            count=0;
            top.pop();
        }
        top.push('(');
    }
    else{
    if(top.isEmpty()){
        top.push('(');
        need++;
    }    
    count++;

    if(count == 2){
        top.pop();
        count=0;
    }
    }
}  

 
    if(count==1){
        need++;
        count=0;
        top.pop();
    }
    while(!top.isEmpty()){
    
    need+=2;
    top.pop();
    }

        
  return need;  }
}