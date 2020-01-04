package com.jsd.Stack;

import java.util.Stack;

public class EvalRPN {
    public int evalRPN(String[] tokens) {
//        打代码不打注释等于白打
//        打代码不会打注释说明根本不会
//        根据逆波兰表示法，求表达式的值。
//        有效的运算符包括 +, -, *, / 。每个运算对象可以是整数，也可以是另一个逆波兰表达式
        /*
        这个程序是先将字符串数组里面的数字压入栈中
        遇到运算符就弹出最后入栈的两个数字进行相应的运算
        Integer.parseInt()将字符串转换为数字
        */
        /*          百度百科 逆波兰表达式
        它的优势在于只用两种简单操作，入栈和出栈就可以搞定任何普通表达式的运算。其运算方式如下：
        如果当前字符为变量或者为数字，则压栈，如果是运算符，
        则将栈顶两个元素弹出作相应运算，结果再入栈，
        最后当表达式扫描完后，栈里的就是结果。
        */
        Stack<Integer> stack =new Stack<>();
        for(int i = 0;i < tokens.length;++ i){
            String s = tokens[i];
            int num1 = 0;
            int num2 = 0;
            if(s.equals("+")){
                num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num2 + num1);
            }
            else if(s.equals("-")){
                num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num2 - num1);
            }
            else if(s.equals("*")){
                num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num2 * num1);
            }
            else if(s.equals("/")){
                num1 = stack.pop();
                num2 = stack.pop();
                stack.push(num2 / num1);
            }else {
                stack.push(Integer.parseInt(s));
            }
        }
        return stack.pop();
    }
}
