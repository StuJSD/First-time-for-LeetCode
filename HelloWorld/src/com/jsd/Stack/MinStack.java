package com.jsd.Stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class MinStack {
    //定义两个栈，一个正常放数据，一个放当前最小的元素
    Stack<Integer> minStack;
    Stack<Integer> stack;
    /** initialize your data structure here. */
    public MinStack() {
        minStack = new Stack<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty() || minStack.peek() >= x){
            minStack.push(x);
        }
    }

    public void pop() {
        int x = stack.pop();
        if(x == minStack.peek()){
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
