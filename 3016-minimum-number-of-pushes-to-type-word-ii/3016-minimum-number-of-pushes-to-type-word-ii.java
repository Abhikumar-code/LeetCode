class Solution {
    public int minimumPushes(String word) {

    int [] arr=new int[26];
    for(int i=0; i<word.length(); i++){
    char ch=word.charAt(i);    
    arr[ch-'a']++;
    }
    
    int cost=0;
    
    Arrays.sort(arr);
    int x=8;
    int y=1;
    
    for(int i=25 ; i>=0 ; i--){
    if(arr[i]==0) break;    
    if(x==0){
        x=8;
        y++;
    }
    cost=cost+(arr[i]*y);
    x--;
    }
    return cost;}

    
}