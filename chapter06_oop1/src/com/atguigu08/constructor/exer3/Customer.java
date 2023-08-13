package com.atguigu08.constructor.exer3;

public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    public Customer(String firstName,String lastName){
        this.firstName = firstName;
        this.lastName = lastName;

    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }
}
