package com.atguigu04.example.exer3;

import org.junit.Test;

// 利用面向对象的编程方法，设计类Circle计算圆的面积。
public class Circle {
    int r;
    static double PI = 3.14;

    double area(){
        return r*r*PI;
    }

    @Test
    public void Test01(){
        Circle c = new Circle();

    }

}
