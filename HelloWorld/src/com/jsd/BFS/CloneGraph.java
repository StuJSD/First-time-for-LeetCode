package com.jsd.BFS;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CloneGraph {
    HashMap<Integer,Node> hashMap = new HashMap<Integer, Node>();
    ArrayDeque<Node> arrayDeque = new ArrayDeque<Node>();
    Node newNode;
    public Node cloneGraph(Node node){
        if(node == null){
            return null;
        }
        arrayDeque.addLast(node);
        while (! arrayDeque.isEmpty()){
            Node tmp = arrayDeque.pollFirst();
            Node nowdo = null;
            if(! hashMap.containsKey(tmp.val)){
                nowdo = new Node(tmp.val,new ArrayList<Node>());
                hashMap.put(tmp.val,nowdo);
            }else {
                nowdo = hashMap.get(tmp.val);
            }
            if(hashMap.size() == 1){
                newNode = nowdo;
            }
            List<Node> list = tmp.neighbors;
            for(Node n : list){
                if(! hashMap.containsKey(n.val)){
                    arrayDeque.addLast(n);
                    Node node1 = new Node(n.val,new ArrayList<Node>());
                    nowdo.neighbors.add(node1);
                    hashMap.put(n.val,node1);
                }else {
                    nowdo.neighbors.add(hashMap.get(n.val));
                }
            }
        }
        return newNode;
    }
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