package com.budget.Budget;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

  @Test
  void testBalance() {
    Command cmd = new Command();
    Account myAccount = new Account("Chase", 500.00);
    assertEquals(myAccount.getBalance(),500.00);

    Purchase p1 = new Purchase(15.00, "Chipotle");
    cmd.execute(myAccount,p1);
    assertEquals(myAccount.getBalance(),485.00);

    Bill b1 = new Bill("Electricity",65.00, new Date(2020,05,01));
    ;
  }
}