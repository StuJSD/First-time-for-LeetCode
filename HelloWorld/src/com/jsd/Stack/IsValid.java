package com.jsd.Stack;

import java.util.Stack;

public class IsValid {
    public boolean isValid(String s) {
        if((s.length() & 1) == 1){
            //System.out.println(s.length());
            return false;
        }
        char [] cs = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length();++ i){
            if(cs[i] == '(' || cs[i] == '[' || cs[i] == '{'){
                stack.push(cs[i]);//()[]{}
            }else {
                if(stack.empty())
                    return false;
                if((cs[i] == ')') && (stack.peek() != '('))
                    return false;
                if((cs[i] == ']') && (stack.peek() != '['))
                    return false;
                if((cs[i] == '}') && (stack.peek() != '{'))
                    return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
