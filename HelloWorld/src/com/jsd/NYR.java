package com.jsd;

import java.util.Scanner;

public class NYR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year,month,day;
        year = scanner.nextInt();
        month = scanner.nextInt();
        day = scanner.nextInt();
        int ans = day;
        int[] ints = {31,60,91,121,152,182,213,244,274,305,335,366};
        if(month == 1){
            System.out.println(ans);
            return;
        }
        if(((year & 3) == 0 && year % 100 != 0) || year % 400 == 0){
                ans = ints[month - 2] + day;
        }else {
                ans = ints[month - 2] + day - 1;
        }
        System.out.println("第 " + ans + " 天");
    }
}
