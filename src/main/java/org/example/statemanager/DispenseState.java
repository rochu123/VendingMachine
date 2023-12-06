package org.example.statemanager;

import org.example.Product;
import org.example.VendingMachine;

public class DispenseState extends State {


    DispenseState(VendingMachine machine, String slotId) {

        System.out.println("dispensing");
        dispenseProduct(machine, slotId);
    }

    public Product dispenseProduct(VendingMachine machine, String slotId) {
        System.out.println("Product has been dispensed");
        Product product = machine.getInventory().dispenseProductFromSlot(slotId);
        machine.setMoney(0);
        machine.setState(new IdleState());
        return product;
    }

}
