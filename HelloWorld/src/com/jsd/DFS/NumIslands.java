package com.jsd.DFS;



public class NumIslands {
    public int numIslands(char[][] grid) {

        if(grid.length == 0){
            return 0;
        }
        int count = 0;
        for(int i = 0; i < grid.length;i ++){
            for(int j = 0;j < grid[0].length;j ++){
                if(grid[i][j] == '1'){
                    count ++;
                }
                DFS(grid,i,j);
            }
        }
        return count;
    }

    private void DFS(char[][] grid, int i, int j) {
        //将所有的已探索的岛屿变为海洋
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length){
            return;//越界返回
        }
        if(grid[i][j] == '0'){//遇到海洋返回
            return;
        }
        grid[i][j] = '0';
        //从上下左右遍历
        DFS(grid,i - 1,j);
        DFS(grid,i + 1,j);
        DFS(grid,i,j - 1);
        DFS(grid,i,j + 1);
    }
}
