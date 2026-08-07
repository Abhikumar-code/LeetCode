class Solution {
    public int mostWordsFound(String[] sentences) {


    int maxlen =0;
    for(int i=0; i<sentences.length ; i++){
    
    String[] temp=sentences[i].split(" ");
    
    if(maxlen<temp.length) maxlen=temp.length;
    
    }

    return maxlen; }
}