package com.atguigu08.constructor.exer3;

import org.junit.Test;

public class CusTest {
    @Test
    public void test(){
        Customer customer = new Customer("Jane","Smith");
        customer.setAccount(new Account(1000,2000,0.0123));
        customer.getAccount().deposit(2000);
        customer.getAccount().withdraw(1500);
        customer.getAccount().withdraw(15000);
    }
}
