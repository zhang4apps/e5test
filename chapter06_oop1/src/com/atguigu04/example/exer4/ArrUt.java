package com.atguigu04.example.exer4;

import java.util.Arrays;

// 求最大值、最小值、总和、平均数、遍历数组、
// 复制数组、数组反转、数组排序(默认从小到大排序)、查找等
public class ArrUt {
    /**
     * 取int[]的最大值
     * @param a 要获取最大值的数组
     * @return 最大值
     */
    public int max(int[] a) {
        int max = a[0];
        if (a.length > 1) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] < a[i + 1]) {
                    max = a[i + 1];
                }
            }
        }
        return max;
    }

    /**
     * 取int[]的最小 值
     * @param a
     * @return
     */
    public int mix(int[] a) {
        int mix = a[0];
        if (a.length > 1) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    mix = a[i + 1];
                }
            }
        }
        return mix;
    }

    // 求总和
    public int sum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }

    // 求平均数
    public int avg(int[] a) {
        return sum(a)/a.length;
    }
    // 遍历
    public void toString(int[] a) {
        System.out.println(Arrays.toString(a));
    }
    // 复制数组
    public int[] copy(int[] a) {
        int[] copy = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            copy[i] = a[i];
        }
        return copy;
    }
    // 数组反转
    public int[] reverse(int[] a) {
        int temp = 0;
        for (int i = 0,j = a.length-1; i < j; i++,j--) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
/*        if (a.length > 1) {
            for (int i = 0; i < a.length/2; i++) {

                    temp = a[i];
                    a[i] = a[a.length-i-1];
                    a[a.length-i-1] = temp;

            }
        }*/
        return a;
    }
    // 数组排序(默认从小到大排序)
    public void maop(int[] a) {
        int temp = 0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                    if (a[j]>a[j+1]){
                        temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
            }
        }
    }
    // 查找
    public int indexOf(int[] a,int b) {

        for (int i = 0; i < a.length; i++) {
            if (b==a[i]){
               return i;
            }
        }
        return -1;
    }


}
