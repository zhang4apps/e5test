package com.atguigu07.encapsulation.exer1;

public class PersonTest {
    // 在PersonTest类中实例化Person类的对象b，
    // 调用setAge()和getAge()方法，体会Java的封装性。
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(67);
        p.setAge(-1);
        p.setAge(156);

        System.out.println(p.getAge());
    }
}
