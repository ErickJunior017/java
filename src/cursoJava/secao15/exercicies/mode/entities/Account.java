package cursoJava.secao15.exercicies.mode.entities;

import cursoJava.secao15.exercicies.mode.entities.excection.DomainWithDraw;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withDraw(Double amount){
        if (getBalance() < amount ){
            throw new DomainWithDraw("Not enough balance");
        }
        if (amount > getWithdrawLimit()){
            throw new DomainWithDraw("The amount exceeds withdraw limit");
        }
        balance -= amount;
    }

    @Override
    public String toString(){
        return "New balance: " + getBalance();
    }
}
