package com.jsd;

import com.jsd.DFS.FindTargetSumWays;
import com.jsd.MyQueue.MyQueue;
import com.jsd.Stack.BackspaceCompare;
import com.jsd.Stack.CalPoints;
import com.jsd.Stack.MyStack;

public class Test {
    public static void main(String[] args) {

        String s = "y#fo##f";
        String t = "y#f#o##f";
        boolean b;
        BackspaceCompare backspaceCompare = new BackspaceCompare();
        b = backspaceCompare.backspaceCompare(s,t);
        System.out.println(b);

        /*for(int i = 1;i <= 16;++ i){
            for(int j = 1;j <= i;++ j){
                System.out.printf("%H x %H = %H\t",j,i,i * j);
            }
            System.out.println();
        }*/
        /*CalPoints calPoints = new CalPoints();
        String[] strings = {"5","-2","4","C","D","9","+","+"};
        int i = calPoints.calPoints(strings);
        System.out.println(i);*/
        /*MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        int i1 = myStack.pop();
        int i2 = myStack.top();
        boolean b1 = myStack.empty();*/
        /*MyQueue o = new MyQueue();
        o.push(1);
        o.push(2);
        int i1 = o.peek();
        int i2 = o.pop();
        boolean b1 = o.empty();*/
        /*int[] i = {1,1,1,1,1};
        FindTargetSumWays findTargetSumWays = new FindTargetSumWays();
        int a = findTargetSumWays.findTargetSumWays(i,3);*/
        /*int[][] a = new int[2][3];
        *//*EvalRPN evalRPN = new EvalRPN();
        String[] strings = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};*/
//        System.out.println(i);
        /*DailyTemperatures dailyTemperatures = new DailyTemperatures();
        int [] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int [] ans = dailyTemperatures.dailyTemperatures(T);
        for(int i = 0;i < 8;++ i)
            System.out.print(ans[i]);
        System.out.printf("%d",25);*/
        /*IsValid isValid = new IsValid();
        System.out.println(isValid.isValid("(("));*/

        /*NumSquares numSquares = new NumSquares();
        System.out.println(numSquares.numSquares(135));*/
        /*OpenLock openLock = new OpenLock();
        String [] strings= {"8888"};
        int ans = openLock.openLock(strings,"0004");
        System.out.println(ans);*/
        /*char [][] grid= {
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','1'}
        };
        char [][] g = {
                {'1','1','1'},
                {'0','1','0'},
                {'1','1','1'}
        };
        NumIslands numIslands = new NumIslands();
        System.out.println(numIslands.numIslands(grid));*/
        /*MyCircularQueue3 myCircularQueue = new MyCircularQueue3(5);
        myCircularQueue.enQueue(1);
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(4);
        myCircularQueue.enQueue(5);
        if(! myCircularQueue.enQueue(6)){
            System.out.println("队列已满！");
        }
        System.out.println(myCircularQueue.Front());
        myCircularQueue.deQueue();
        System.out.println(myCircularQueue.Front());
        myCircularQueue.deQueue();
        System.out.println(myCircularQueue.Front());
        myCircularQueue.deQueue();
        System.out.println(myCircularQueue.Front());
        myCircularQueue.deQueue();
        System.out.println(myCircularQueue.Front());
        myCircularQueue.deQueue();
        System.out.println(myCircularQueue.Front());
        myCircularQueue.deQueue();
        *//*while (! myCircularQueue.isEmpty()){
            System.out.println(myCircularQueue.Front());
            myCircularQueue.deQueue();
        }*/

    }
}
