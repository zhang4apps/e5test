package com.atguigu08.constructor.exer3;


    class A{
        A(){
            System.out.println("A类无参构造器");
        }
        A(int a){
            System.out.println("A类有参构造器");
        }
    }
    class B extends A{
        B(){
            super();//可以省略，调用父类的无参构造
            System.out.println("B类无参构造器");
        }
        B(int a){
            super(a);//调用父类有参构造
            System.out.println("B类有参构造器");
        }
    }
    class Test8{
        public static void main(String[] args){
            B b1 = new B();
            B b2 = new B(10);
        }
    }

