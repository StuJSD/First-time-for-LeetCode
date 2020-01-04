package com.jsd.DSU;

public class NumIslands {
    public int numIslands(char [][] grid){//并查集    未完成    能力不足
        int count = 0;
        int nr = grid.length;   //行数    num row
        int nc = grid[0].length;//列数    num column
        int [] parent = new int [nr * nc];
        int [] rank = new int [nr * nc];
        for(int i = 0;i < nr;i ++){
            for(int j = 0;j < nc;j ++){
                if(grid[i][j] == '1'){
                    parent[i * nc + j] = i * nc + j;
                    count ++;
                }
                rank[i * nc + j] = 0;
            }
        }
        return count;
    }
    class DSU{
        int count;
        int [] parent;
        int [] rank;
        public DSU(char [][] grid){
            count = 0;
            int nr = grid.length;
            int nc = grid[0].length;
            parent = new int [nr * nc];
            rank = new int [nr * nc];
            for(int i = 0;i < nr;i ++){
                for(int j = 0;j < nc;j ++){
                    if(grid[i][j] == '1'){
                        parent[i * nc + j] = i * nc + j;
                        count ++;
                    }
                    rank[i * nc + j] = 0;
                }
            }
        }
        public int find(int i){
            if(parent[i] != i){
                parent[i] = find(parent[i]);
            }
            return parent[i];
        }
        public void union(int x,int y){
            int rootx = find(x);
            int rooty = find(y);
            if(rootx != rooty){
                if(rank[rootx] > rank [rooty]){
                    parent[rooty] = rootx;
                }else if(rank[rootx] < rank[rooty]){
                    parent[rootx] = rooty;
                }else {
                    parent[rooty] = rootx;
                    rank[rootx] += 1;
                    --count;
                }
            }
        }
        public int getCount(){
            return count;
        }
    }
}
