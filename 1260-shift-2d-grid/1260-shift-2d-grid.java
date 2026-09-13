class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        while(k-->0){
            int res[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    int temp=0;
                    if(i<=m-1 && j<n-1) {
                        temp=grid[i][j+1];
                        res[i][j+1]=grid[i][j];
                    }
                    else if(i<m-1 && j==n-1) {
                        temp=grid[i+1][0];
                        res[i+1][0]=grid[i][j];
                    }
                    else if(i==m-1 && j==n-1) {
                        temp=grid[0][0];
                        res[0][0]=grid[i][j];
                    }
                }
            }
            grid= res;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> listRow = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                listRow.add(grid[i][j]); 
            }
            result.add(listRow);
        }
        return result;
    }
}