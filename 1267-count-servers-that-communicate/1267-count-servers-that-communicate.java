class Solution {
    public int countServers(int[][] grid) {
        List<Integer> row=new ArrayList<>();
        List<Integer> col=new ArrayList<>();

        for(int i=0; i<grid.length ; i++){
            int count=0;
            for(int j=0; j<grid[0].length ; j++){
              if(grid[i][j]==1) count++;
            }
            row.add(count);
        }
         for(int i=0; i<grid[0].length ; i++){
            int count=0;
            for(int j=0; j<grid.length ; j++){
              if(grid[j][i]==1) count++;
            }
            col.add(count);
        }
         
         int count=0;
         for(int i=0; i<grid.length ; i++){
            for(int j=0; j<grid[0].length ; j++){
              if(grid[i][j]==1 &&(row.get(i)>1 || col.get(j)>1)) count++;
            }
        }
    return count;}
}