package com.atguigu04.example.exer4;

import org.junit.Test;

public class Test1 {
    @Test
    public void Test01(){
        ArrUt au = new ArrUt();
        int[] a = new int[]{34,56,223,2,56,24,56,24,56,67,778,45};
        //System.out.println(au.max(a));
        /*au.maop(a);
        au.toString(a);*/
        System.out.println(au.indexOf(a,67));
       /* int[] copy = au.copy(a);
        au.toString(copy);*/
        //au.toString(au.reverse(a));
        // System.out.println(exer.method3(5,4));


    }


}
