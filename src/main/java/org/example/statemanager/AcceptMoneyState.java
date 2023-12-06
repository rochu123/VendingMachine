package org.example.statemanager;

import org.example.VendingMachine;

public class AcceptMoneyState extends State {

    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        machine.setState(new SelectionState());
    }

    public void insertCoin(VendingMachine machine, int val) {
        System.out.println("Accepting the money");
        machine.setMoney(machine.getMoney() + val);
    }

    public int refundFullMoney(VendingMachine machine) {
        System.out.println("returning money");
        machine.setState(new IdleState());
        return machine.getMoney();
    }


}
