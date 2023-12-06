package org.example.statemanager;

import org.example.Product;
import org.example.VendingMachine;

public class SelectionState extends State {


    public void chooseProduct(VendingMachine machine, String slotId) {

        Product product = machine.getInventory().getProductFromSlotId(slotId);

        int paidByUser = machine.getMoney();

        if (paidByUser < product.getPrice()) {
            System.out.println("Insufficient Amount prdct price is" + product.getPrice() + " you paid: " + paidByUser);
            refundFullMoney(machine);
            throw new RuntimeException("pagaad bdhaao sahib");
        } else if (paidByUser >= product.getPrice()) {

            if (paidByUser > product.getPrice()) {
                getChange(paidByUser - product.getPrice());
            }
            machine.setState(new DispenseState(machine, slotId));
        }
    }


    public int getChange(int returnExtraMoney) {
        System.out.println("Returning remaining money to user " + returnExtraMoney);
        return returnExtraMoney;
    }

    public int refundFullMoney(VendingMachine machine) {
        System.out.println("returning money");
        machine.setState(new IdleState());
        return machine.getMoney();
    }
}
