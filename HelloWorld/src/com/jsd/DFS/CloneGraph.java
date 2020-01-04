package com.jsd.DFS;

import java.util.*;

public class CloneGraph {
    public Node cloneGraph(Node node) {
        if(node == null){
            return null;
        }
        Map<Node,Node> map = new HashMap<>();
        Node newNode = new Node(node.val,new ArrayList<>());
        Deque<Node> list = new LinkedList<>();

        map.put(node,newNode);
        list.offer(node);
        while (! list.isEmpty() ){
            Node tmp = list.poll();
            for(Node n : tmp.neighbors){
                if(! map.containsKey(n)){
                    map.put(n,new Node(n.val,new ArrayList<>()));
                    list.offer(n);
                }
                map.get(tmp).neighbors.add(map.get(n));
            }
        }
        return newNode;
    }
    /*
// Definition for a Node.

*/

}
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}