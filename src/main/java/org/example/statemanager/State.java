package org.example.statemanager;

import org.example.Product;
import org.example.VendingMachine;

public abstract class State {

    public void clickOnInsertButton(VendingMachine machine) {
        throw new RuntimeException("Unsupported Operation");
    }

    public void clickOnStartProductSelectionButton(VendingMachine machine) {
        throw new RuntimeException("Unsupported Operation");
    }

    public void insertCoin(VendingMachine machine, int val) {
        System.out.println("state is "+ machine.getState());
        throw new RuntimeException("Unsupported Operation");
    }

    public void chooseProduct(VendingMachine machine, String slotId) {
        throw new RuntimeException("Unsupported Operation");
    }

    public int getChange(int returnChangeMoney) {
        throw new RuntimeException("Unsupported Operation");
    }

    public Product dispenseProduct(VendingMachine machine, String slotId) {
        throw new RuntimeException("Unsupported Operation");
    }

    public int refundFullMoney(VendingMachine machine) {
        throw new RuntimeException("Unsupported Operation");
    }


}
