package com.budget.Budget;

import java.util.Date;

public class Bill implements Expense {
  private double cost;
  private String ID;
  private boolean paid;
  private Date dueDate;

  Bill(String ID, double cost, Date dueDate) {
    this.paid = false;
    this.ID = ID;
    this.cost = cost;
    this.dueDate = dueDate;
  }

  public double getCost() {
    return cost;
  }

  public String getID() {
    return ID;
  }

  public Date getDueDate() {
    return dueDate;
  }

  public boolean isPaid() {
    return paid;
  }

  /**
   * returns true if the bill is over-due
   */
  public boolean isOverDue() {
    Date today = new Date();
    return dueDate.after(today);
  }
}
