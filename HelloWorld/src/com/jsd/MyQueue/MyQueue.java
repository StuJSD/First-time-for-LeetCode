package com.jsd.MyQueue;

import java.util.Stack;

public class MyQueue {
    Stack<Integer> stackPush;
    Stack<Integer> stackPop;
    //用栈实现队列
    /** Initialize your data structure here. */
    public MyQueue() {
        stackPush = new Stack<>();
        stackPop = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (! stackPush.isEmpty()){
            stackPop.push(stackPush.pop());
        }
        stackPop.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (! stackPop.isEmpty()){
            stackPush.push(stackPop.pop());
        }
        return stackPush.pop();
    }

    /** Get the front element. */
    public int peek() {
        while (! stackPop.isEmpty()){
            stackPush.push(stackPop.pop());
        }
        return stackPush.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stackPush.isEmpty() && stackPop.isEmpty();
    }
}
