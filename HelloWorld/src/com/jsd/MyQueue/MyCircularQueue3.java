package com.jsd.MyQueue;

public class MyCircularQueue3 {
    private int [] queue;
    private int head;
    private int tail;
    private int length;//队列长度


    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue3(int k) {

        length = k ;//不留空间，而是设置head = -1来判断空满
        queue = new int[length];
        head = -1;
        tail = -1;

    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {

        if(isFull()){
            return false;
        }
        if(isEmpty()){
            head = tail = 0;
        }
        queue[tail] = value;
        tail = (tail + 1) % length;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {

        if(isEmpty()){
            return false;
        }

        head = (head + 1) % length;
        if(head == tail){
            head = tail = -1;
        }
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

        return head == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {

        return (head == tail) && (head != -1);//(tail + 1) % length == head;
    }
}
