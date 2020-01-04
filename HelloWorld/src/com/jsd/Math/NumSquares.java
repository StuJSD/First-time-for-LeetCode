package com.jsd.Math;

public class NumSquares {
    public int numSquares(int n){
        //Lagrange 四平方定理： 任何一个正整数都可以表示成不超过四个整数的平方之和
        int tmp = n;
        //满足四数平方和定理的数n（四个整数的情况），必定满足 n=4^a(8b+7)
        //若一个数m满足： m=2^n 那么k % m = k & (m-1)
        while((n & 3) == 0){//对4取余 n & 3
            n >>= 2;
        }
        if((n & 7) == 7){//对8取余 n & 7
            return 4;
        }
        n = tmp;
        for(int i = 0;i * i <= n;++ i){
            if(i * i == n){
                return 1;
            }
        }
        for(int i = 0;i * i <= n;++ i){
            for(int j = 0;j * j <= n;++ j){
                if(i * i + j * j == n)
                    return 2;
            }
        }
        return 3;
    }
}
