package com.jsd.Stack;

import java.util.Stack;

/**
 * Package:com.jsd.Stack
 * Description:
 * Author:jiangshengdian
 * Data:  2020/1/3  18:45
 * Modified By
 */
public class BackspaceCompare {

    public boolean backspaceCompare(String S, String T) {
        char[] charsS = S.toCharArray();
        char[] charsT = T.toCharArray();
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        for (int i = 0;i < S.length();++ i){
//            if(charsS[i] == '#' && ! stackS.empty()){
//                stackS.pop();
//            }else if (charsS[i] != '#'){
//                stackS.push(charsS[i]);
//            }
            if(charsS[i] == '#'){
                if(! stackS.empty()){//是#并且栈不为空，弹出前一个元素
                    stackS.pop();
                }
            }else {
                stackS.push(charsS[i]);
            }
        }
        for (int i = 0;i < T.length();++ i){
//            if(! stackT.empty() && charsT[i] == '#'){
//                stackT.pop();
//            }else if (charsT[i] != '#'){
//                stackT.push(charsT[i]);
//            }
            if(charsT[i] == '#'){
                if(! stackT.empty()){
                    stackT.pop();
                }
            }else {
                stackT.push(charsT[i]);
            }
        }
        //比较栈中元素是否相同
        return stackS.equals(stackT);
        
//        S = stackS.toString();
//        T = stackT.toString();
//        return S.equals(T);
//        while (! stackS.empty() && ! stackT.empty()){
////            char pops = stackS.pop();
////            char popt = stackT.pop();
////            System.out.println(pops + " " + popt);
//            if(stackS.pop() != stackT.pop())
//                return false;
//        }
////        char nm = stackT.pop();
////        System.out.println(nm);
//        if(stackS.empty() && stackT.empty()){
////            System.out.println("empty");
//            return true;
//        }
//        return false;
    }
}
