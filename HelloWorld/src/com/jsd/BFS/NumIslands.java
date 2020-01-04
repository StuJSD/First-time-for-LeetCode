package com.jsd.BFS;

import java.util.LinkedList;
import java.util.Queue;

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
                BFS(grid,i,j);
            }
        }
        return count;
    }

    private void BFS(char[][] grid, int i, int j) {
        Queue<Integer> queue = new LinkedList();
        queue.offer(i);
        queue.offer(j);
        //把每个岛屿附近的岛屿都遍历
        while (! queue.isEmpty()){
            i = queue.poll();//poll()为获得队列的第一个元素并删除元素
            j = queue.poll();
            if(grid[i][j] != '1'){
                continue;//遇到海洋终止本次遍历
            }
            grid[i][j] = '0';
            //向左
            if(i - 1 >= 0){
                queue.offer(i - 1);
                queue.offer(j);
            }
            //向右
            if(i + 1 < grid.length){
                queue.offer(i + 1);
                queue.offer(j);
            }
            //向上
            if(j - 1 >= 0){
                queue.offer(i);
                queue.offer(j - 1);
            }
            //向下
            if(j + 1 < grid[i].length){
                queue.offer(i);
                queue.offer(j + 1);
            }
        }
    }
}
