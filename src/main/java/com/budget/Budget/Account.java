package com.budget.Budget;

public class Account {
  private String name;
  private double balance;

  Account(String name, double balance) {
    this.balance = balance;
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  @Override
  public String toString() {
    return "com.budget.Budget.account{" +
            "name='" + name + '\'' +
            ", balance=" + balance +
            '}';
  }
}
