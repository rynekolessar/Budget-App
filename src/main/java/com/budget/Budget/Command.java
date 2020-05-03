package com.budget.Budget;

public class Command {
  /**
   * Executes Purchase or Bill Payment
   * @param account
   * @param expense
   */
  public void execute(Account account, Expense expense) {
    double newBal = account.getBalance()-expense.getCost();
    if (newBal < 0.0) {
      System.err.println("Declined: Balance too low.");
    } else {
      account.setBalance(newBal);
    }
  }
}
