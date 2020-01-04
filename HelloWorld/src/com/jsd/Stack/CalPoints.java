package com.jsd.Stack;

import java.util.Stack;

public class CalPoints {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(int i = 0;i < ops.length;i ++){
            switch (ops[i]){
                case "C":
                    res -= stack.pop();    //前一轮分数无效 弹出来
                    break;
                case "D":
                    int t = stack.peek();//获取前一轮分数
                    res += 2 * t;
                    stack.push(2 * t);
                    break;
                case "+":
                    int one = stack.pop();//前第一轮分数
                    int two = stack.peek();//前第二轮分数
                    int sum = one + two;  //本轮分数
                    res += sum;
                    stack.push(one);
                    stack.push(sum);
                    break;
                default:
                    int point = Integer.parseInt(ops[i]);
                    stack.push(point);//添加本轮分数
                    res += point;
                    break;
            }
        }
        return res;
    }
}
