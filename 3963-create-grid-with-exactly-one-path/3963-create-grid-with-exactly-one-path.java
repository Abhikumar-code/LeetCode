class Solution {
    public String[] createGrid(int m, int n) {

     StringBuilder sb=new StringBuilder();

     String [] ans=new String[m];
     int ind=0;

     for(int i=0; i<m-1; i++ ){
     sb.append('.');
     sb.append("#".repeat(n-1)); 
     
     ans[ind++]=sb.toString();
     sb.setLength(0);
     }
     

     for(int i=0 ; i<n ; i++){
      sb.append(".");
     }
     ans[ind]=sb.toString();
  return ans;  }
}