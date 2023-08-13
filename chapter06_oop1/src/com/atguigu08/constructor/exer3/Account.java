package com.atguigu08.constructor.exer3;

public class Account {
    private int id;
    private double balance;
    private double aun;
    public Account(){

    }
    public Account(int id,double balance,double aun){
        this.id = id;
        this.balance = balance;
        this.aun =aun;
    }
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAun(){
        return aun;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAun(double aun){
        this.aun = aun;
    }

    /**
     * 存款
     * @param jin 存款金额
     */
    public void deposit(double jin){
        if (jin>0){
            balance+=jin;
            System.out.println("存入"+jin+",当前账户余额为："+balance);
        }
    }
    /**
     * 取款
     * @param jin 取款金额
     */
    public void withdraw(double jin){
        if (balance>jin&&jin>0){
            balance -= jin;
            System.out.println("成功取出："+jin+",当前账户余额为："+balance);
        }else {
            System.out.println("当前账户余额不足："+balance);
        }
    }

}
