package com.jsd.Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length];
        /*大神代码写法 先找出数组中最大的数字 然后通过数组记录其出现的位置 for循环遍历找出目标
        int l1 = nums1.length;
        int l2 = nums2.length;
        int max = 0;
        for(int num : nums2){
            max = Math.max(num,max);
        }
        int[] m = new int[max + 1];
        for(int i = 0;i < l2;i ++)
            m[nums2[i]] = i;
        for (int i = 0;i < l1;i ++){
            res[i] = -1;
            for(int j = m[nums1[i]];j < l2;j ++){
                if(nums2[j] > nums1[i]){
                    res[i] = nums2[j];
                    break;
                }
            }
        }*/
//        int i = 0;
//        while (nums1[0] != nums2[i])
//            i ++;
        /*可以ac 但是执行时间太多
        for(int j = 0;j < nums1.length;j ++){
            int i = 0;
            while (nums1[j] != nums2[i] && i < nums2.length)
                i ++;
            for(int k = i;k < nums2.length;k ++){
                if(nums1[j] < nums2[k]){
                    res[j] = nums2[k];
                    break;
                }else {
                    res[j] = -1;
                }
            }
        }*/
        //官方给的解法
        //构建单调栈，最小的元素入栈，遇到比栈顶更大的数栈顶元素弹出
        //并继续与栈顶元素比
        //用HashMap记录第一个比栈顶元素大的值
        Stack<Integer> stack = new Stack<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums2.length ; i ++){
            while (! stack.isEmpty() && nums2[i] > stack.peek()){
                map.put(stack.pop(),nums2[i]);//用HashMap记录第一个比栈顶元素大的值
            }
            stack.push(nums2[i]);
        }
        //经过上面循环还没有出栈的值说名后面没有更小的了
        while (! stack.isEmpty()){
            map.put(stack.pop(),-1);
        }
        for(int i = 0;i < nums1.length;i ++){
            res[i] = map.get(nums1[i]);//获取第一个比num1数字大的值
        }
        return res;
    }
}
