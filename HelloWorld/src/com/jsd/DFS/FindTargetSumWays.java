package com.jsd.DFS;

public class FindTargetSumWays {
    int res = 0;
    public int findTargetSumWays(int[] nums, int S) {
        findTargetSunWay(nums,S,0);
        return res;
    }
    public void findTargetSunWay(int[] nums,int S,int p){
        if(p >= nums.length){
            if(S == 0){//结果加或减数组里面的值，直到等于0退出
                res ++;
            }
            return;
        }
        findTargetSunWay(nums,S - nums[p],p + 1);
        findTargetSunWay(nums,S + nums[p],p + 1);
    }
}
