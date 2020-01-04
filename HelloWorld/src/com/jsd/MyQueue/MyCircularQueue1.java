package com.jsd.MyQueue;

class MyCircularQueue1 {

    private int [] queue;
    private int head;
    private int tail;
    private int length;//队列长度
    private int size;//队列元素个数

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue1(int k) {

        length = k ;//不留空间，而是设置一个size来记录队列当前长度
        queue = new int[length];
        head = 0;
        tail = 0;
        size = 0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {

        if(isFull()){
            return false;
        }
        size ++;
        queue[tail] = value;
        tail = (tail + 1) % length;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {

        if(isEmpty()){
            return false;
        }
        size --;
        head = (head + 1) % length;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {

        if(isEmpty()){
            return -1;
        }
        return queue[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {

        if(isEmpty()){
            return -1;
        }
        return queue[(tail - 1 +length) % length];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {

        return size == 0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {

        return size == length;
    }
}