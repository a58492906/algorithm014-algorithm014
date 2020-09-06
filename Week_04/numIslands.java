class Solution {
        public int numIslands(char[][] grid) {
         int count =0;
         int m=grid.length;
         if(m==0)
             return 0;
         int n=grid[0].length;
         for(int i=0;i<m;i++){
             for(int j=0;j<n;j++){
                 if(grid[i][j]=='1'){

                     landhelper(grid,i,j);
                     count++;
                 }
             }
        }
return count;
        
        }

        void landhelper(char[][] grid,int i,int j){
            if(i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0'){
                return;
            }
            grid[i][j]='0';
            landhelper(grid,i,j+1);
            landhelper(grid,i+1,j);
            landhelper(grid,i-1,j);
            landhelper(grid,i,j-1);
        }
    }