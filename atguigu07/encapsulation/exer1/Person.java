package com.atguigu07.encapsulation.exer1;
// 创建程序,在其中定义两个类：Person和PersonTest类。定义如下：


public class Person {
    private int age;
    // 用setAge()设置人的合法年龄(0~130)，用getAge()返回人的年龄。
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age>=0&&age<=130) {
            this.age = age;
        }else {
            System.out.println("该年龄非法");
        }
    }
}
