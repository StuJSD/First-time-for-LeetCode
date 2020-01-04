package com.jsd.Stack;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    /*Queue<Integer> queue1;
    Queue<Integer> queue2;*/
    Queue<Integer> singerQueue;
    /*int top;*/
    /** Initialize your data structure here. */
    public MyStack() {
        /*queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();*/
        singerQueue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        //单队列比较好理解，每次入队列的时候都将队首元素移动到最后
        /*queue1.add(x);*/
        singerQueue.add(x);
        int size = singerQueue.size();
        for(int i = 0;i < size - 1;i ++){
            singerQueue.add(singerQueue.poll());
        }
        /*while (! queue2.isEmpty()){
            queue1.add(queue2.poll());
        }
        while (! queue1.isEmpty()){
            queue2.add(queue1.poll());
        }*/
    }

    /*public void tranfer(){
        while (queue1.size() > 1){
            top = queue1.poll();
            queue2.add(top);
        }
        Queue<Integer> tmp = new LinkedList<>();
        tmp = queue1;
        queue1 = queue2;
        queue2 = tmp;
    }*/
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        /*while (queue1.size() > 1){
            top = queue1.remove();
            queue2.add(top);
        }
        Queue<Integer> tmp = new LinkedList<>();
        queue1.remove();
        tmp = queue1;
        queue1 = queue2;
        queue2 = tmp;
        return queue2.poll();*/
        return singerQueue.poll();
    }

    /** Get the top element. */
    public int top() {
        /*while (queue1.size() > 1){
            top = queue1.remove();
            queue2.add(top);
        }
        top = queue1.peek();
        Queue<Integer> tmp = new LinkedList<>();
        tmp = queue1;
        queue1 = queue2;
        queue2 = tmp;
        return queue2.peek();*/
        return singerQueue.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        /*return queue1.isEmpty() && queue2.isEmpty();*/
        return singerQueue.isEmpty();
    }
}
