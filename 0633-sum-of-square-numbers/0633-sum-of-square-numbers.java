class Solution {
    public boolean judgeSquareSum(int c) {

    long first=0;
    long second=(int)Math.sqrt(c);

    while(first<=second){
    long sum=(first*first)+(second*second);
    if(sum==c) return true;
    else if(sum<c){
       first++; 
    }
    else{
       second--;
    }
    }    
    
   return false; }
}