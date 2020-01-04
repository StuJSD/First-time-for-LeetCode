package com.jsd.Stack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        int length = T.length;
        int [] res = new int[length];
        Arrays.fill(res,0);
        Stack<Integer> stack = new Stack<Integer>();
        for(int i = 0;i < length;++ i){
            while (! stack.isEmpty() && T[stack.peek()] < T[i]){
                int t = stack.pop();
                res[t] = i - t;
            }
            stack.push(i);
        }
        /*
        for (int i = length - 2; i >= 0; i--) {
            // j+= result[j]是利用已经有的结果进行跳跃
            for (int j = i + 1; j < length; j += res[j]) {
                if (T[j] > T[i]) {
                    res[i] = j - i;
                    break;
                } else if (res[j] == 0) { //遇到0表示后面不会有更大的值，那当然当前值就应该也为0
                    res[i] = 0;
                    break;
                }
            }
        }
        */
        /*
        for(int i = 0;i < length;i ++){
            for(int j = i + 1; j < length;j ++){
                if(T[j] > T[i]){
                    res[i] = j - i;
                    break;
                }
                else{
                    res[i] = 0;
                }
            }
        }
        */
        return res;
    }
}
