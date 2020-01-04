package com.jsd.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class NumSquares {
    public int numSquares(int n){
        int step = 1;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(n);
        while (! queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i < size;++ i){
                int tmp = queue.poll();
                for (int j = 1;j * j <= tmp;++ j){
                    if(j * j == tmp){
                        return step;
                    }
                    queue.add(tmp - j * j);
                }
            }
            step ++;
        }
        return step;
    }
    public int Squares(int n){
        int res = 0;
        for(int i = 1;i * i <= n; i++){
            res = i;
        }
        return res;
    }
}
