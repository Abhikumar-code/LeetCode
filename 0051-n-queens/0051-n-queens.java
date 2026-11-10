class Solution {
    public List<List<String>> solveNQueens(int n) {
        
    List<List<String>> ans=new ArrayList<>();
    boolean [][] q=new boolean[n][n];

    fun(q,0,new ArrayList<>(),ans);
    
    return ans;
    }

    private void fun(boolean [][] q, int i ,List<String> output, List<List<String>> ans){
          
            if(i==q.length ) {
             ans.add(new ArrayList<>(output));
             return;
            }

           for(int m=0; m<q.length; m++){
            StringBuilder sb=new StringBuilder();
            if(check(q,i,m)) {
            q[i][m]=true;

            sb.append(".".repeat(q.length));
            sb.setCharAt(m,'Q');

            output.add(sb.toString());
            
            fun(q,i+1,output,ans);

            output.remove(output.size()-1);
            q[i][m]=false;
    
          }
        }
    }

    private boolean check(boolean [][] q,int i, int j){
         int n=q.length;
         for(int k=0; k<n ; k++){
            if(q[k][j]) return false;
         }

         // Upper-left diagonal
        int r = i, c = j;
        while (r >= 0 && c >= 0) {
         if (q[r][c]) return false;
         r--;
         c--;
        }

         // Upper-right diagonal
         r = i;
         c = j;
         while (r >= 0 && c < n) {
         if (q[r][c]) return false;
         r--;
         c++;
         }
    return true;}
}