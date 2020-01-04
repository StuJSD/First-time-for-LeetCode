package com.jsd.BFS;

import java.util.*;

        /*
        String类中的contains:
        boolean contains(CharSequence s) : 当且仅当此字符串包含指定的 char 值序列;
        字面意思就是:判断指定内容中是否包含括号中的内容;
        Collection集合中的contains():
        boolean contains(Object o) 判断 集合中 是否 包含指定的元素
        */
public class OpenLock {
    public int openLock(String[] deadends, String target){
        int step = -1;//旋转次数
        //将deadends转为list，方便判断字符串是否是禁忌字符串
        List<String> list= Arrays.asList(deadends);
        Queue<String> queue = new LinkedList<>();//生成队列
        Set<String> used = new HashSet<>();
        queue.add("0000");
        used.add("0000");
        while (! queue.isEmpty()){
            step += 1;
            int size = queue.size();
            for(int i = 0;i < size;++ i){
                String cur = queue.peek();
                if(cur.equals(target)){
                    return step;
                }
                String [] neis = neighbors(cur);
                for (String nei:neis) {
                    if(! used.contains(nei) && ! list.contains(cur)){
                        queue.add(nei);
                        used.add(nei);
                    }
                }
                queue.poll();
            }
        }
        return -1;
    }
    public String [] neighbors (String a){
        String ans[]=new String[8];
        for (int i = 0; i < 4; i++) {
            char[] aa=a.toCharArray();
            int a1=aa[i]-'0';
            if (a1!=0) {
                aa[i]=Character.forDigit(a1-1, 10);
            }else {
                aa[i]='9';
            }
            ans[i*2]=String.valueOf(aa);
            if(a1!=9) {
                aa[i]=Character.forDigit(a1+1, 10);
            }else {
                aa[i]='0';
            }
            ans[i*2+1]=String.valueOf(aa);
        }
        return ans;
    }
}
