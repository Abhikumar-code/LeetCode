class Solution {

    public int countIslands(int[][] grid, int k) {
        int total=0;
        boolean [][]visited=new boolean[grid.length][grid[0].length];
        for(int i=0; i<grid.length ; i++){
          for(int j=0; j<grid[0].length; j++){
            
            if(!visited[i][j] && grid[i][j] != 0){
                long sum= dfs(visited,grid,i,j);
               if(sum%k==0) total++;
            }
          }
        }
        return total;
    }

    private long dfs(boolean [][] visited, int [][] grid,int i, int j){
         
         if(i<0||i>=visited.length) return 0;
         if(j<0 ||j>=visited[0].length) return 0;
         
         if(!visited[i][j] && grid[i][j] != 0){
         visited[i][j]=true;
         long sum=grid[i][j];
         long sum1=dfs(visited,grid,i+1,j);
         long sum2=dfs(visited,grid,i-1,j);
         long sum3=dfs(visited,grid,i,j+1);
         long sum4=dfs(visited,grid,i,j-1);

         return sum+sum1+sum2+sum3+sum4;
         }
         else{
            return 0;
         }
    } 

}