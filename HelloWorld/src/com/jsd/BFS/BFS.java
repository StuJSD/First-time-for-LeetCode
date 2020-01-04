package com.jsd.BFS;

import javax.xml.soap.Node;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    /**
     * Return the length of the shortest path between root and target node.
     */
    /*
    int BFS(Node root, Node target) {
        Queue<Node> queue;  // store all nodes which are waiting to be processed
        int step = 0;       // number of steps neeeded from root to current node
        // initialize
        add root to queue;
        // BFS
        while (queue is not empty) {
            step = step + 1;
            // iterate the nodes which are already in the queue
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                Node cur = the first node in queue;
                return step if cur is target;
                for (Node next : the neighbors of cur) {
                    add next to queue;
                }
                remove the first node from queue;
            }
        }
        return -1;          // there is no path from root to target
    }
    */
    public int BFS(Object root,Object target){
        Queue<Object> queue = new LinkedList<>();
        int step = 0;
        queue.add(root);
        while (! queue.isEmpty()){
            step += 1;
            int size = queue.size();
            for(int i = 0;i < size;++ i){
                Object cur = queue.peek();
                if(cur == target){
                    return step;
                }
                Object[] nexts = neighbors(cur);
                for (Object next:nexts) {
                    queue.add(next);
                }
                queue.poll();
            }
        }
        return -1;
    }
    public Object [] neighbors (Object cur){
        int num = 10;//num 应该给neighbors的数量
        Object [] ret = new Object[num];
        return ret;
    }
}
