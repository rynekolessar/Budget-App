package com.budget.Budget;

public class Purchase implements Expense {
  private double cost;
  private String ID;

  public Purchase(double cost, String ID) {
    this.cost = cost;
    this.ID = ID;
  }

  public double getCost() {
    return this.cost;
  }

  public String getID() {
    return this.ID;
  }
}
